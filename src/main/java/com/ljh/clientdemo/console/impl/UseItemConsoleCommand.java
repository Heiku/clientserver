package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgItemProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/16
 */
public class UseItemConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要使用的道具id: ");

        long itemsId = scanner.nextLong();

        MsgItemProto.RequestItem requestItem = MsgItemProto.RequestItem.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgItemProto.RequestType.USE)
                .setItemsId(itemsId)
                .build();

        channel.writeAndFlush(requestItem);
    }
}
