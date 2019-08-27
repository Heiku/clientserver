package com.ljh.clientdemo.console.impl.guild;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGuildProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/27
 */
public class TakeOutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要取出的物品id：");
        long goodsId = scanner.nextLong();

        System.out.println("请输入你要取出的数量：");
        int num = scanner.nextInt();

        MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                .setType(MsgGuildProto.RequestType.TAKE_OUT)
                .setUserId(LocalUserData.getUserId())
                .setGoodsId(goodsId)
                .setNum(num)
                .build();
        channel.writeAndFlush(req);
    }
}
