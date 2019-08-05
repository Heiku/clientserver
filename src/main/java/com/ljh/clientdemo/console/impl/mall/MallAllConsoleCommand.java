package com.ljh.clientdemo.console.impl.mall;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgMallProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/2
 */
public class MallAllConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgMallProto.RequestMall request = MsgMallProto.RequestMall.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgMallProto.RequestType.MALL)
                .build();

        channel.writeAndFlush(request);
    }
}
