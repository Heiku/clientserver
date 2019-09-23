package com.ljh.clientdemo.console.impl.guild;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGuildProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/26
 */
public class GivePositionConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要赋予权限的玩家id：");
            long roleId = scanner.nextLong();

            System.out.println("请输入你要赋值的权限值：(1：普通成员，2：精英， 3.长老， 4：副会长，5：会长)");
            int position = scanner.nextInt();

            MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                    .setType(MsgGuildProto.RequestType.GIVE)
                    .setRoleId(roleId)
                    .setUserId(LocalUserData.getUserId())
                    .setPosition(position)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
