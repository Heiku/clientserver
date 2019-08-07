package com.ljh.clientdemo.console.impl.email;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEmailProto;
import com.ljh.clientdemo.proto.protoc.MsgMallProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/7
 */
public class EmailReceiveConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        long eid = scanner.nextLong();

        MsgEmailProto.RequestEmail request =  MsgEmailProto.RequestEmail.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgEmailProto.RequestType.RECEIVE)
                .setEid(eid)
                .build();

        channel.writeAndFlush(request);
    }
}
