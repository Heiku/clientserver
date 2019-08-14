package com.ljh.clientdemo.console.impl.group;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgGroupProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 获取组队状态
 *
 * @Author: Heiku
 * @Date: 2019/8/14
 */
public class StateGroupConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        MsgGroupProto.RequestGroup req = MsgGroupProto.RequestGroup.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setType(MsgGroupProto.RequestType.STATE_GROUP)
                .build();

        channel.writeAndFlush(req);
    }
}
