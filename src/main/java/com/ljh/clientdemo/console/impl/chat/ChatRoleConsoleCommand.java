package com.ljh.clientdemo.console.impl.chat;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgChatProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/6
 */
public class ChatRoleConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入聊天的玩家id：");

            long roleId = scanner.nextLong();

            scanner.nextLine();
            System.out.println("\n聊天内容：");

            String content = scanner.nextLine();

            MsgChatProto.RequestChat request = MsgChatProto.RequestChat.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setRoleId(roleId)
                    .setContent(content)
                    .setType(MsgChatProto.RequestType.CHAT)
                    .build();

            channel.writeAndFlush(request);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
