package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgAttackCreepProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/15
 */
public class AttackCreepConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要攻击的野怪id");

        Integer creepId = scanner.nextInt();

        MsgAttackCreepProto.RequestAttackCreep request = MsgAttackCreepProto.RequestAttackCreep.newBuilder()
                .setType(MsgAttackCreepProto.RequestType.ATTACK)
                .setCreepId(creepId)
                .setUserId(LocalUserData.getUserId())
                .build();

        channel.writeAndFlush(request);
    }
}
