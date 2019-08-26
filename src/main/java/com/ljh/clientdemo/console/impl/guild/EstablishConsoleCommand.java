package com.ljh.clientdemo.console.impl.guild;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGuildProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/26
 */
public class EstablishConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要建立的公会名称：");
        String name = scanner.next();

        System.out.println("请输入公会的公告：");
        String bulletin = scanner.next();

        MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                .setType(MsgGuildProto.RequestType.ESTABLISH)
                .setUserId(LocalUserData.getUserId())
                .setGuildName(name)
                .setBulletin(bulletin)
                .build();
        channel.writeAndFlush(req);
    }
}
