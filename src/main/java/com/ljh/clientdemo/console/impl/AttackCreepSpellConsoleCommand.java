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
public class AttackCreepSpellConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要施放的技能id：");

        Integer spellId = scanner.nextInt();

        System.out.println("请输入你要攻击的野怪：");
        Integer creepId = scanner.nextInt();

        MsgAttackCreepProto.RequestAttackCreep request = MsgAttackCreepProto.RequestAttackCreep.newBuilder()
                .setType(MsgAttackCreepProto.RequestType.SPELL)
                .setSpellId(spellId)
                .setCreepId(creepId)
                .setUserId(LocalUserData.getUserId())
                .build();

        channel.writeAndFlush(request);
    }
}
// sp 10022
// sp 10021
// sp 10021 10001