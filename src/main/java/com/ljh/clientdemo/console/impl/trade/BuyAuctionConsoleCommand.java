package com.ljh.clientdemo.console.impl.trade;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgTradeProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/29
 */
public class BuyAuctionConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("输入你要竞拍的物品交易id：");
            long tradeId = scanner.nextLong();

            System.out.println("请输入你要竞拍的价格：");
            int price = scanner.nextInt();

            MsgTradeProto.RequestTrade req = MsgTradeProto.RequestTrade.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgTradeProto.RequestType.BUY_AUCTION)
                    .setTradeId(tradeId)
                    .setPrice(price)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
