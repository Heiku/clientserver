package com.ljh.clientdemo.console.impl.role;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 创建玩家角色的控制台
 *
 * @Author: Heiku
 * @Date: 2019/8/19
 */
public class CreateRoleConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你的玩家名称：");
        String roleName = scanner.next();

        System.out.println("请输入你要创建的角色类型");
        int type = scanner.nextInt();

        MsgRoleProto.RequestRole req = MsgRoleProto.RequestRole.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setRoleName(roleName)
                .setRoleType(type)
                .setType(MsgRoleProto.RequestType.CREATE_ROLE)
                .build();
        channel.writeAndFlush(req);
    }
}
