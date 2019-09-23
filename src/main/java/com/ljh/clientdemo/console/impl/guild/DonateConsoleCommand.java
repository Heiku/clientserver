package com.ljh.clientdemo.console.impl.guild;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGuildProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/26
 */
public class DonateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要捐献的物品id：");
            long goodsId = scanner.nextLong();

            System.out.println("请输入你要捐献的数量：");
            int num = scanner.nextInt();

            MsgGuildProto.RequestGuild req = MsgGuildProto.RequestGuild.newBuilder()
                    .setType(MsgGuildProto.RequestType.DONATE)
                    .setUserId(LocalUserData.getUserId())
                    .setGoodsId(goodsId)
                    .setNum(num)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
