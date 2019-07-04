package com.ljh.clientdemo.client;

import com.google.protobuf.MessageLite;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class NettyClient {

    private EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

    @Value("${netty.port}")
    private int port;

    @Value("${netty.host}")
    private String host;

    private SocketChannel socketChannel;


    public void sendMsg(MessageLite messageLite){
        socketChannel.writeAndFlush(messageLite);
    }

    @PostConstruct
    public void start() {
        Bootstrap b = new Bootstrap();

        b.group(eventLoopGroup)
                .channel(NioSocketChannel.class)
                .remoteAddress(host, port)

                // 客户端只有option
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChildHandlerInitializer());

        ChannelFuture channelFuture = b.connect();

        // 客户端断线重连逻辑
        channelFuture.addListener((ChannelFutureListener) future -> {
            if (future.isSuccess()){
                log.info("连接 Netty 服务器成功");
            }else {
                log.info("连接失败，进行断线重连");
                future.channel().eventLoop().schedule(() -> start(), 10, TimeUnit.SECONDS);
            }
        });

        socketChannel = (SocketChannel) channelFuture.channel();
    }
}
