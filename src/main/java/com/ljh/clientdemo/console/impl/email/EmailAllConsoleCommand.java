package com.ljh.clientdemo.console.impl.email;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEmailProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/9
 *
 * 获取所有邮件信息
 */
public class EmailAllConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgEmailProto.RequestEmail req = MsgEmailProto.RequestEmail.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgEmailProto.RequestType.EMAIL)
                .build();

        channel.writeAndFlush(req);
    }
}
