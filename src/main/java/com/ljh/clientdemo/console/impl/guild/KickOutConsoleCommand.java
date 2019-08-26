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
public class KickOutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要踢出公会的玩家id：");
        long roleId = scanner.nextLong();

        MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                .setType(MsgGuildProto.RequestType.KICK_OUT)
                .setUserId(LocalUserData.getUserId())
                .setRoleId(roleId)
                .build();
        channel.writeAndFlush(req);
    }
}
