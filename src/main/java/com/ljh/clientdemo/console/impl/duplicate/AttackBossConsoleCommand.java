package com.ljh.clientdemo.console.impl.duplicate;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgDuplicateProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/1
 */
public class AttackBossConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        //System.out.println("请输入你要攻击的BossId: ");
        long bossId = scanner.nextLong();

        MsgDuplicateProto.RequestDuplicate request = MsgDuplicateProto.RequestDuplicate.newBuilder()
                .setUserId(LocalUserData.getUserId())
                .setBossId(bossId)
                .setType(MsgDuplicateProto.RequestType.CHALLENGE)
                .build();

        channel.writeAndFlush(request);
    }
}

// attackb 10001
// attackb 10002



