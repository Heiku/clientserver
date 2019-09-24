package com.ljh.clientdemo.console.impl.task;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgTaskProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/9/10
 */
public class TaskSubmitConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要提交的taskId：");
            long taskId = scanner.nextLong();

            MsgTaskProto.RequestTask req = MsgTaskProto.RequestTask.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgTaskProto.RequestType.TASK_SUBMIT)
                    .setTaskId(taskId)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
