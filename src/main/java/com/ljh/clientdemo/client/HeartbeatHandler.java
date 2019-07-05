package com.ljh.clientdemo.client;

import com.ljh.clientdemo.proto.MessageBase;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.channel.EventLoop;
import io.netty.handler.timeout.IdleState;
import io.netty.handler.timeout.IdleStateEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.UUID;
import java.util.concurrent.TimeUnit;

@Slf4j
public class HeartbeatHandler extends ChannelInboundHandlerAdapter {

    @Autowired
    private NettyClient nettyClient;

    @Override
    public void userEventTriggered(ChannelHandlerContext ctx, Object evt) throws Exception {
        if (evt instanceof IdleStateEvent){
            IdleStateEvent idleStateEvent = (IdleStateEvent) evt;
            if (idleStateEvent.state() == IdleState.WRITER_IDLE){
                log.info("已经有10s没有发送消息给服务端");
            }

            // 向服务端发送心跳包
            MessageBase.Message heartbeat = MessageBase.Message.newBuilder()
                    .setRequestId(UUID.randomUUID().toString())
                    .setType(MessageBase.RequestType.HEARTBEAT_REQUEST)
                    .setContent("heartbeat")
                    .build();

            // 发送心跳消息，并在发送失败的时候关闭该连接
            ctx.writeAndFlush(heartbeat).addListener(ChannelFutureListener.CLOSE_ON_FAILURE);
        }
    }

    // 服务端挂了的话，执行重连机制
    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        EventLoop eventLoop = ctx.channel().eventLoop();
        eventLoop.schedule(() -> nettyClient.start(), 10L, TimeUnit.SECONDS);

        super.channelInactive(ctx);
    }


    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("捕获后的异常:{}", cause.getMessage());
        ctx.channel().close();
    }
}
