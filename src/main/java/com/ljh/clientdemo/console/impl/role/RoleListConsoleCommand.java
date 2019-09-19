package com.ljh.clientdemo.console.impl.role;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/9/19
 */
public class RoleListConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgRoleProto.RequestRole req = MsgRoleProto.RequestRole.newBuilder()
                .setType(MsgRoleProto.RequestType.ROLE_LIST)
                .setUserId(LocalUserData.getUserId())
                .build();
        channel.writeAndFlush(req);
    }
}
