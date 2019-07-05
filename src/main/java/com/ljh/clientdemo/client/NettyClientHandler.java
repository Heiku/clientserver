package com.ljh.clientdemo.client;

import com.ljh.clientdemo.proto.MessageBase;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

import java.util.UUID;


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
        //log.info("客户端收到消息：{}", message.toString());
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
        cause.printStackTrace();
        ctx.close();
    }


    /**
     * 建立连接立刻向服务端发送 获取用户请求，判断当前用户是否登录
     *
     * @param ctx
     * @throws Exception
     */
    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
    }
}
