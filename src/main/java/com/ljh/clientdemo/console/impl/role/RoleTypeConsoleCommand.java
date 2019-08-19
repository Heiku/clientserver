package com.ljh.clientdemo.console.impl.role;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 展示系统角色类型控制台
 *
 * @Author: Heiku
 * @Date: 2019/8/19
 */
public class RoleTypeConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgRoleProto.RequestRole req = MsgRoleProto.RequestRole.newBuilder()
                .setType(MsgRoleProto.RequestType.ROLE_TYPE)
                .build();
        channel.writeAndFlush(req);
    }
}
