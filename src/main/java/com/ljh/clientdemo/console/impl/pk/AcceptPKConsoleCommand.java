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
 * 玩家攻击玩家 命令
 */
public class AcceptPKConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要接受 PK 的玩家id：");
        long roleId = scanner.nextLong();

        MsgPKProto.RequestPK req = MsgPKProto.RequestPK.newBuilder()
                .setType(MsgPKProto.RequestType.AC)
                .setUserId(LocalUserData.getUserId())
                .setRoleId(roleId)
                .build();

        channel.writeAndFlush(req);
    }
}
