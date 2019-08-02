package com.ljh.clientdemo.console.impl.duplicate;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgDuplicateProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/1
 */
public class LeaveDuplicateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgDuplicateProto.RequestDuplicate request = MsgDuplicateProto.RequestDuplicate.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgDuplicateProto.RequestType.LEAVE)
                .build();

        channel.writeAndFlush(request);
    }
}
