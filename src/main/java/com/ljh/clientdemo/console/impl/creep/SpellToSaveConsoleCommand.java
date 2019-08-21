package com.ljh.clientdemo.console.impl.creep;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgAttackCreepProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/7/23
 *
 * 施放保护技能
 */
public class SpellToSaveConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            System.out.println("请输入你要施放的技能id：");

            int spellId = scanner.nextInt();

            MsgAttackCreepProto.RequestAttackCreep request = MsgAttackCreepProto.RequestAttackCreep.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setSpellId(spellId)
                    .setType(MsgAttackCreepProto.RequestType.SAVE)
                    .build();

            channel.writeAndFlush(request);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
