package com.ljh.clientdemo.console.impl.user;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import com.ljh.clientdemo.proto.protoc.MsgUserInfoProto;
import io.netty.channel.Channel;

import java.util.Scanner;
import java.util.UUID;

/**
 * 发送选择角色指令
 */
public class StateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            long userId = LocalUserData.getUserId();
            if (userId <= 0){
                System.out.println("当前用户尚未登录服务器，请进行登录操作!\n 具体登录指令：login");
                return;
            }

            System.out.println("请输入你要登录的角色id：");
            long roleId = scanner.nextLong();


            MsgRoleProto.RequestRole req = MsgRoleProto.RequestRole.newBuilder()
                    .setType(MsgRoleProto.RequestType.ROLE_STATE)
                    .setUserId(userId)
                    .setRoleId(roleId)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
