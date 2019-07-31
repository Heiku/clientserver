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
 * 副本控制台
 */
public class DuplicateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgDuplicateProto.RequestDuplicate request = MsgDuplicateProto.RequestDuplicate.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .build();

        channel.writeAndFlush(request);
    }
}
