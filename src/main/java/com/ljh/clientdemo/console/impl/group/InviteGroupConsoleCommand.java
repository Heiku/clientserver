package com.ljh.clientdemo.console.impl.group;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGroupProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 邀请组队命令行
 *
 * @Author: Heiku
 * @Date: 2019/8/14
 */
public class InviteGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要邀请加入队伍的玩家id：（当队伍未创建时，默认为队长）");

            long roleId = scanner.nextLong();

            MsgGroupProto.RequestGroup req = MsgGroupProto.RequestGroup.newBuilder()
                    .setType(MsgGroupProto.RequestType.INVITE_GROUP)
                    .setUserId(LocalUserData.getUserId())
                    .setRoleId(roleId)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
