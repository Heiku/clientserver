package com.ljh.clientdemo.console.impl;

import com.google.common.base.Strings;
import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.TalkEntityProto;
import io.netty.channel.Channel;

import java.util.Scanner;

public class TalkEntityConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("老哥，你想和哪位 npc 谈谈心呢？：");

        String npcName = scanner.next();
        if (Strings.isNullOrEmpty(npcName)){
            System.out.println("暂不支持与空气对话，请选择一位 npc 进行对话");
            return;
        }

        TalkEntityProto.RequestTalkEntity requestTalkEntity = TalkEntityProto.RequestTalkEntity.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setEntityName(npcName)
                .setSolo(1)
                .build();

        channel.writeAndFlush(requestTalkEntity);
    }
}
