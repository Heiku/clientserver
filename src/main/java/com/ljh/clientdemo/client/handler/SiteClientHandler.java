package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.proto.protoc.MsgSiteInfoProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class SiteClientHandler extends SimpleChannelInboundHandler<MsgSiteInfoProto.ResponseSiteInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgSiteInfoProto.ResponseSiteInfo responseSiteInfo) throws Exception {

        System.out.println(responseSiteInfo.getContent());
    }
}
