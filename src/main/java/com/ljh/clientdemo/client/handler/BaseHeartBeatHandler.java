package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.proto.MessageBase;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BaseHeartBeatHandler extends SimpleChannelInboundHandler<MessageBase.Message> {

    private int baseTime = 8;

    private Channel channel;

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MessageBase.Message message) throws Exception {

    }


    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        super.channelActive(ctx);
        this.channel = ctx.channel();

        //ping(ctx.channel());
    }



}
