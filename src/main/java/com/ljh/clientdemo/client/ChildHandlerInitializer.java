package com.ljh.clientdemo.client;

import com.ljh.clientdemo.client.handler.EntityInfoClientHandler;
import com.ljh.clientdemo.client.handler.ServerIdleStateHandler;
import com.ljh.clientdemo.client.handler.SiteClientHandler;
import com.ljh.clientdemo.client.handler.UserInfoClientHandler;
import com.ljh.clientdemo.codec.CustomProtobufDecoder;
import com.ljh.clientdemo.codec.CustomProtobufEncoder;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.socket.SocketChannel;

public class ChildHandlerInitializer extends ChannelInitializer<SocketChannel> {

    @Override
    protected void initChannel(SocketChannel socketChannel) throws Exception {
        ChannelPipeline pipeline = socketChannel.pipeline();

        // 空闲消息处理器
        pipeline.addLast(new ServerIdleStateHandler());
        //pipeline.addLast(new HeartbeatHandler());

        // 采用自定义的编码解码器
        pipeline.addLast("decoder",new CustomProtobufDecoder());
        pipeline.addLast("encoder",new CustomProtobufEncoder());

        pipeline.addLast(new NettyClientHandler());
        pipeline.addLast(new UserInfoClientHandler());
        pipeline.addLast(new SiteClientHandler());
        pipeline.addLast(new EntityInfoClientHandler());
    }
}
