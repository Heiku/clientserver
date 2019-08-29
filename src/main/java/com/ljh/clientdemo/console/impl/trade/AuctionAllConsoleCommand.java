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
public class AuctionAllConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgTradeProto.RequestTrade req = MsgTradeProto.RequestTrade.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgTradeProto.RequestType.AUCTION_ALL)
                .build();
        channel.writeAndFlush(req);
    }
}
