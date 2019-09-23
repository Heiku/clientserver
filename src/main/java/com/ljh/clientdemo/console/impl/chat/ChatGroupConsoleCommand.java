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
public class ChatGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你向全服发送的消息：");

        scanner.nextLine();
        String content = null;
        try {
            content = scanner.nextLine();
        } catch (Exception e){
            System.out.println("输入参数有误！");
        }

        MsgChatProto.RequestChat request = MsgChatProto.RequestChat.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setContent(content)
                .setType(MsgChatProto.RequestType.CHATG)
                .build();
        channel.writeAndFlush(request);
    }
}
