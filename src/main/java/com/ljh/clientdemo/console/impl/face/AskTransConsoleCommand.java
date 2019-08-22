package com.ljh.clientdemo.console.impl.face;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgFaceTransProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/22
 */
public class AskTransConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要交易的物品id：");
        long goodsId = scanner.nextLong();

        System.out.println("请输入你要交易的数量：");
        int num = scanner.nextInt();

        System.out.println("输入要交易的金额：");
        int amount = scanner.nextInt();

        MsgFaceTransProto.RequestFaceTrans req = MsgFaceTransProto.RequestFaceTrans.newBuilder()
                .setType(MsgFaceTransProto.RequestType.ASK_TRANS)
                .setUserId(LocalUserData.getUserId())
                .setGoodsId(goodsId)
                .setNum(num)
                .setAmount(amount)
                .build();
        channel.writeAndFlush(req);
    }
}
