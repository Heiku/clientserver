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
public class SpellToBossConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        //System.out.println("请输入你要施放的技能id：");
        Integer spellId = scanner.nextInt();

        MsgDuplicateProto.RequestDuplicate request = MsgDuplicateProto.RequestDuplicate.newBuilder()
                .setType(MsgDuplicateProto.RequestType.SPELL)
                .setUserId(LocalUserData.getUserId())
                .setSpellId(spellId)
                .build();

        channel.writeAndFlush(request);
    }
}

// spb 10020
// spb 10021


// spb 10001
// spb 10002