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
public class BuyFixedPriceConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要购买物品的交易id：");
        long tradeId = scanner.nextLong();

        MsgTradeProto.RequestTrade req = MsgTradeProto.RequestTrade.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgTradeProto.RequestType.BUY_FIXED)
                .setTradeId(tradeId)
                .build();
        channel.writeAndFlush(req);
    }
}
