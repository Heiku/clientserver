package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgDuplicateProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/30
 *
 * 进入副本控制器
 */
public class EnterDuplicateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入挑战的副本id：");

        long duId = scanner.nextLong();

        MsgDuplicateProto.RequestDuplicate request = MsgDuplicateProto.RequestDuplicate.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setDupId(duId)
                .setType(MsgDuplicateProto.RequestType.ENTER)
                .build();

        channel.writeAndFlush(request);
    }
}
