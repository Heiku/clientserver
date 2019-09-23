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
public class InitiateTransConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {

        try {
            System.out.println("请输入你要交易的对象：(双方必须再同一场景上，并且等级不低于30，荣誉值不低于50)");
            long roleId = scanner.nextLong();

            MsgFaceTransProto.RequestFaceTrans req = MsgFaceTransProto.RequestFaceTrans.newBuilder()
                    .setUserId(LocalUserData.getUserId())
                    .setRoleId(roleId)
                    .setType(MsgFaceTransProto.RequestType.INITIATE)
                    .build();
            channel.writeAndFlush(req);
        } catch (Exception e) {
            System.out.println("输入参数有误， 请重新输入！\n");
        }
    }
}
