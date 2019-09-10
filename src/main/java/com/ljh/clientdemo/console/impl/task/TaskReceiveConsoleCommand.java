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
public class TaskReceiveConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.println("请输入你要接受的任务id：");
        long taskId = scanner.nextLong();


        MsgTaskProto.RequestTask req = MsgTaskProto.RequestTask.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setTaskId(taskId)
                .setType(MsgTaskProto.RequestType.TASK_RECEIVE)
                .build();
        channel.writeAndFlush(req);
    }
}
