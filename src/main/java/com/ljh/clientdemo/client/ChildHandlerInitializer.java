package com.ljh.clientdemo.client;

import com.ljh.clientdemo.client.handler.EntityInfoClientHandler;
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

        /*pipeline.addLast(new IdleStateHandler(0, 10, 0))

                .addLast(new ProtobufVarint32FrameDecoder())
                .addLast(new ProtobufDecoder(MessageBase.Message.getDefaultInstance()))
                .addLast(new ProtobufVarint32LengthFieldPrepender())
                .addLast(new ProtobufEncoder())

                .addLast(new NettyClientHandler());*/

        // 采用自定义的编码解码器
        pipeline.addLast("decoder",new CustomProtobufDecoder());
        pipeline.addLast("encoder",new CustomProtobufEncoder());

        pipeline.addLast(new NettyClientHandler());
        pipeline.addLast(new UserInfoClientHandler());
        pipeline.addLast(new SiteClientHandler());
        pipeline.addLast(new EntityInfoClientHandler());
    }
}
