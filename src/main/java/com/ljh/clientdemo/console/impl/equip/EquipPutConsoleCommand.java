package com.ljh.clientdemo.console.impl.equip;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEquipProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/17
 */
public class EquipPutConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要穿戴的装备id：");

        long equipId = Long.valueOf(scanner.next());

        MsgEquipProto.RequestEquip requestEquip = MsgEquipProto.RequestEquip.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgEquipProto.RequestType.PUT)
                .setEquipId(equipId)
                .build();

        channel.writeAndFlush(requestEquip);
    }
}
