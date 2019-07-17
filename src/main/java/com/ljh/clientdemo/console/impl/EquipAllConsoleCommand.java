package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEquipProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/17
 */
public class EquipAllConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgEquipProto.RequestEquip request = MsgEquipProto.RequestEquip.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgEquipProto.RequestType.EQUIP)
                .build();

        channel.writeAndFlush(request);
    }
}
