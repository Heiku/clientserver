package com.ljh.clientdemo.console.impl.task;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgTaskProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/9/6
 */
public class TaskStateConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgTaskProto.RequestTask req = MsgTaskProto.RequestTask.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgTaskProto.RequestType.TASK_STATE)
                .build();
        channel.writeAndFlush(req);
    }
}
