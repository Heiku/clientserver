package com.ljh.clientdemo.client;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MessageBase;
import com.ljh.clientdemo.utils.SessionUtil;
import com.ljh.clientdemo.utils.SpringUtil;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class NettyClientHandler extends SimpleChannelInboundHandler<MessageBase.Message> {

    /**
     * 客户端接受信息
     *
     * @param ctx
     * @param message
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageBase.Message message) throws Exception {
        if (message.getResult() != ResultCode.SUCCESS){
            System.out.println(message.getContent());
            return;
        }

        System.out.println(message.getContent());
    }


    /**
     * 处理异常，一般将异常处理逻辑的Handler放在ChannelPipeline的最后
     * 确保入站的消息总是能被处理
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        log.error("server close, waiting retry");
    }


    /**
     * 建立连接立刻向服务端发送 获取用户请求，判断当前用户是否登录
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {

        // 正常连接，包括断线重连
        // 将 userId 组装到 channel中
        SessionUtil.bindSession(LocalUserData.getUserId(), ctx.channel());
    }


    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        super.channelInactive(ctx);

        SpringUtil.getBean(NettyClient.class).doConnect();
        SessionUtil.bindSession(LocalUserData.getUserId(), ctx.channel());
    }
}
