package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgItemProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/16
 *
 * 获取背包信息console
 */
public class BagAllConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgItemProto.RequestItem requestItem = MsgItemProto.RequestItem.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgItemProto.RequestType.ALL)
                .build();

        channel.writeAndFlush(requestItem);
    }
}
