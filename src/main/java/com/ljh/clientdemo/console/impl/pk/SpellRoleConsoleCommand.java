package com.ljh.clientdemo.console.impl.pk;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgPKProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/12
 *
 * 玩家技能施放 命令行
 */
public class SpellRoleConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        int spellId = scanner.nextInt();
        long roleId = scanner.nextLong();

        MsgPKProto.RequestPK req = MsgPKProto.RequestPK.newBuilder()
                .setType(MsgPKProto.RequestType.SPR)
                .setUserId(LocalUserData.getUserId())
                .setSpellId(spellId)
                .setRoleId(roleId)
                .build();

        channel.writeAndFlush(req);

        // spr spellId roleId
        // spr 10020 10003
    }
}
