package com.ljh.clientdemo.console.impl.group;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGroupProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 加入组队命令行
 *
 * @Author: Heiku
 * @Date: 2019/8/14
 */
public class JoinGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        try {
            long groupId = scanner.nextLong();

            MsgGroupProto.RequestGroup req = MsgGroupProto.RequestGroup.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgGroupProto.RequestType.JOIN)
                    .setGroupId(groupId)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
