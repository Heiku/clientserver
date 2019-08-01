package com.ljh.clientdemo.console.impl.site;

import com.google.common.base.Strings;
import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgSiteInfoProto;
import io.netty.channel.Channel;

import java.util.Scanner;
import java.util.UUID;

/**
 * 发送移动指令
 */
public class MoveConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("英雄，请输入想要到达的地点：");

        String destination = scanner.next();
        if (Strings.isNullOrEmpty(destination)){
            System.out.println("当前的目的地为空，请重新输入 move 指令");
            return;
        }

        // 构造request
        MsgSiteInfoProto.RequestSiteInfo requestSiteInfo = MsgSiteInfoProto.RequestSiteInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setType(MsgSiteInfoProto.RequestType.MOVE)
                .setContent(destination)
                .build();

        channel.writeAndFlush(requestSiteInfo);
    }
}
