package com.ljh.clientdemo.console.impl.face;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgFaceTransProto;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: Heiku
 * @Date: 2019/8/22
 */
public class NoTransConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        try {
            long tmpTransId = scanner.nextLong();

            MsgFaceTransProto.RequestFaceTrans req = MsgFaceTransProto.RequestFaceTrans.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setTmpId(tmpTransId)
                    .setType(MsgFaceTransProto.RequestType.NO_TRANS)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
