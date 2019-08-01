package com.ljh.clientdemo.console.impl.spell;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgSpellProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/11
 */
public class LearnSpellConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你想学习地技能id：");

        int spellId = Integer.valueOf(scanner.next());

        MsgSpellProto.RequestSpell requestSpell = MsgSpellProto.RequestSpell.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgSpellProto.RequestType.LEARN)
                .setSpellId(spellId)
                .build();

        channel.writeAndFlush(requestSpell);
    }
}
