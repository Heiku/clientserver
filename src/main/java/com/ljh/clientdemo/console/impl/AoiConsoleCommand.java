package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEntityInfoProto;
import io.netty.channel.Channel;

import java.util.Scanner;
import java.util.UUID;

public class AoiConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        // 加入用户ID作为标识符
        MsgEntityInfoProto.RequestEntityInfo requestEntityInfo = MsgEntityInfoProto.RequestEntityInfo.newBuilder()
                .setType(MsgEntityInfoProto.RequestType.AOI)
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .build();

        channel.writeAndFlush(requestEntityInfo);
    }
}
