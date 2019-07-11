package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgSpellProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/11
 */
public class SpellConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgSpellProto.RequestSpell requestSpell = MsgSpellProto.RequestSpell.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgSpellProto.RequestType.SPELL)
                .build();

        channel.writeAndFlush(requestSpell);
    }
}
