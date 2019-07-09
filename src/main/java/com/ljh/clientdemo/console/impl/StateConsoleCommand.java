package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
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
        long userId = LocalUserData.getUserId();
        if (userId <= 0){
            System.out.println("当前用户尚未登录服务器，请进行登录操作!\n 具体登录指令：login");
            return;
        }

        MsgUserInfoProto.RequestUserInfo requestUserInfo = MsgUserInfoProto.RequestUserInfo.newBuilder()
                .setType(MsgUserInfoProto.RequestType.STATE)
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(userId)
                .build();

        channel.writeAndFlush(requestUserInfo);
    }
}
