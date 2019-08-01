package com.ljh.clientdemo.console.impl.site;

import com.ljh.clientdemo.console.ConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgSiteInfoProto;
import io.netty.channel.Channel;

import java.util.Scanner;
import java.util.UUID;

/**
 * 发送site指令
 */
public class SiteConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {

        MsgSiteInfoProto.RequestSiteInfo requestSiteInfo = MsgSiteInfoProto.RequestSiteInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setType(MsgSiteInfoProto.RequestType.SITE)
                .setContent("client request site info")
                .build();

        channel.writeAndFlush(requestSiteInfo);
    }
}
