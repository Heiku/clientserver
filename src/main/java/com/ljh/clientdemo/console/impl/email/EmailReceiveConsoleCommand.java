package com.ljh.clientdemo.console.impl.email;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgEmailProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/7
 */
public class EmailReceiveConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要接收的邮件id：");
            long eid = scanner.nextLong();

            MsgEmailProto.RequestEmail request =  MsgEmailProto.RequestEmail.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgEmailProto.RequestType.RECEIVE)
                    .setEid(eid)
                    .build();

            channel.writeAndFlush(request);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
