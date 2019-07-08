package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.proto.MessageBase;
import io.netty.channel.Channel;

import java.util.Scanner;
import java.util.UUID;

public class DateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setType(MessageBase.RequestType.DATE)
                .setContent("client request date info")
                .build();

        channel.writeAndFlush(msg);
    }
}
