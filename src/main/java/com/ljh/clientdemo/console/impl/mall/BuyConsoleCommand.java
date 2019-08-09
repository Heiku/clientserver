package com.ljh.clientdemo.console.impl.mall;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgMallProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/2
 */
public class BuyConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入要购买的商品id：");
        Long cid = scanner.nextLong();

        System.out.println("请输入你要购买的数量: ");
        int num = scanner.nextInt();

        MsgMallProto.RequestMall request = MsgMallProto.RequestMall.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setCId(cid)
                .setType(MsgMallProto.RequestType.BUY)
                .setNum(num)
                .build();

        channel.writeAndFlush(request);
    }
}