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
public class TaskGiveUpConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要放弃的任务id：");
            long taskId = scanner.nextLong();

            MsgTaskProto.RequestTask req = MsgTaskProto.RequestTask.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setType(MsgTaskProto.RequestType.TASK_GIVE_UP)
                    .setTaskId(taskId)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
