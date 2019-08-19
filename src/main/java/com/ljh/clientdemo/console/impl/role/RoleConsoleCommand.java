package com.ljh.clientdemo.console.impl.role;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 展示当前的玩家信息控制台
 *
 * @Author: Heiku
 * @Date: 2019/8/19
 */
public class RoleConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgRoleProto.RequestRole req = MsgRoleProto.RequestRole.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgRoleProto.RequestType.ROLE)
                .build();
        channel.writeAndFlush(req);
    }
}
