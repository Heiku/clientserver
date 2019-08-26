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
public class GuildAllConsoleCcommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgGuildProto.RequestType.GUILD_ALL)
                .build();
        channel.writeAndFlush(req);
    }
}
