package com.ljh.clientdemo.console.impl.guild;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGuildProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 获取当前的公会信息
 *
 * @Author: Heiku
 * @Date: 2019/8/26
 */
public class GuildConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                .setType(MsgGuildProto.RequestType.GUILD)
                .setUserId(LocalUserData.getUserId())
                .build();
        channel.writeAndFlush(req);
    }
}
