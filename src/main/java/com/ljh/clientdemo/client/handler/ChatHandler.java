package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.MsgChatProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author: Heiku
 * @Date: 2019/8/6
 */
public class ChatHandler extends SimpleChannelInboundHandler<MsgChatProto.ResponseChat> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgChatProto.ResponseChat response) throws Exception {
        if(response.getResult() != ResultCode.SUCCESS){
            System.out.println(response.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (response.getType() == MsgChatProto.RequestType.MSG){
            sb.append(response.getContent() + "\n");

            RoleProto.Role role = response.getRole();
            String msg = response.getMsg();
            sb.append("【 " + role.getName() + " 】 : " + msg + "\n");

            System.out.println(sb.toString());
        }else {
            System.out.println(response.getContent() + "\n");
        }
    }
}
