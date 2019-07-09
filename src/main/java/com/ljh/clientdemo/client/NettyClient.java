package com.ljh.clientdemo.client;

import com.google.protobuf.MessageLite;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.*;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.concurrent.TimeUnit;

@Component
@Slf4j
public class NettyClient {
    // 最大重试次数
    private static final int MAX_RETRY = 5;

    // 连接server的端口
    @Value("${netty.port}")
    private int port;

    // host
    @Value("${netty.host}")
    private String host;

    private EventLoopGroup eventLoopGroup = new NioEventLoopGroup();

    private Channel channel;

    private Bootstrap bootstrap;

    @PostConstruct
    public void start() {
        bootstrap = new Bootstrap();

        bootstrap.group(eventLoopGroup)
                .channel(NioSocketChannel.class)
                .remoteAddress(host, port)

                // 客户端只有option
                .option(ChannelOption.SO_KEEPALIVE, true)
                .option(ChannelOption.TCP_NODELAY, true)
                .handler(new ChildHandlerInitializer());

        // 连接操作，包括重连
        doConnect();
    }


    protected void doConnect(){
        if (channel != null && channel.isActive()){
            return;
        }

        ChannelFuture channelFuture = bootstrap.connect();

        channelFuture.addListener(new ChannelFutureListener() {
            @Override
            public void operationComplete(ChannelFuture channelFuture) throws Exception {
                if (channelFuture.isSuccess()){
                    channel = channelFuture.channel();

                    log.info("Connect to Server Successfully!");
                }else {
                    log.error("Failed to connect to server, try connect after 5s");

                    channelFuture.channel().eventLoop().schedule(() -> {
                        doConnect();
                    }, 5, TimeUnit.SECONDS);
                }
            }
        });
    }

    public Channel getChannel(){
        return channel;
    }

    public void sendMsg(MessageLite messageLite){
        channel.writeAndFlush(messageLite);
    }
}
