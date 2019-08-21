package com.ljh.clientdemo.console.impl.item;

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
        try {
            System.out.println("请输入你要使用的道具id: ");

            long itemsId = scanner.nextLong();

            MsgItemProto.RequestItem requestItem = MsgItemProto.RequestItem.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgItemProto.RequestType.USE)
                    .setItemsId(itemsId)
                    .build();

            channel.writeAndFlush(requestItem);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
