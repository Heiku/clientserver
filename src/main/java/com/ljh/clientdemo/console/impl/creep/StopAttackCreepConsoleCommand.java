package com.ljh.clientdemo.console.impl.creep;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgAttackCreepProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/31
 */
public class StopAttackCreepConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgAttackCreepProto.RequestAttackCreep request = MsgAttackCreepProto.RequestAttackCreep.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgAttackCreepProto.RequestType.STOP)
                .build();

        channel.writeAndFlush(request);
    }
}
