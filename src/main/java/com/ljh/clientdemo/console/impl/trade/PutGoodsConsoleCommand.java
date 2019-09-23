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
public class PutGoodsConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你上架的物品id：");
            long goodsId = scanner.nextLong();

            System.out.println("请输入你要交易的物品数量：");
            int num = scanner.nextInt();

            System.out.println("请输入你要交易的类型：（1：一口价模式，2：拍卖模式）");
            int tradeType = scanner.nextInt();

            System.out.println("请输入你要设置的起售价：");
            int price = scanner.nextInt();

            MsgTradeProto.RequestTrade req = MsgTradeProto.RequestTrade.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgTradeProto.RequestType.PUT_GOODS)
                    .setGoodsId(goodsId)
                    .setNum(num)
                    .setTradeType(tradeType)
                    .setPrice(price)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
