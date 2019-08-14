package com.ljh.clientdemo.console.impl.group;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGroupProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 退出组队命令行
 *
 * @Author: Heiku
 * @Date: 2019/8/14
 */
public class ExitGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgGroupProto.RequestGroup req = MsgGroupProto.RequestGroup.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgGroupProto.RequestType.EXIT_GROUP)
                .build();
        channel.writeAndFlush(req);
    }
}
