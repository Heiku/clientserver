package com.ljh.clientdemo.console.impl.pk;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgPKProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/12
 *
 * 退出战斗 命令行
 */
public class EscapeConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        long roleId = scanner.nextLong();

        MsgPKProto.RequestPK requestPK = MsgPKProto.RequestPK.newBuilder()
                .setType(MsgPKProto.RequestType.ESCAPE)
                .setUserId(LocalUserData.getUserId())
                .setRoleId(roleId)
                .build();

        channel.writeAndFlush(requestPK);

        // escape 10003
    }
}