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
        try {
            System.out.println("请输入要购买的商品id：");
            long cid = scanner.nextLong();

            System.out.println("请输入你要购买的数量: ");
            int num = scanner.nextInt();

            MsgMallProto.RequestMall request = MsgMallProto.RequestMall.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setCId(cid)
                    .setType(MsgMallProto.RequestType.BUY)
                    .setNum(num)
                    .build();

            channel.writeAndFlush(request);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}