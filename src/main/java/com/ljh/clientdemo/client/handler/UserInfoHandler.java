package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgUserInfoProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import com.ljh.clientdemo.utils.IOUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class UserInfoHandler extends SimpleChannelInboundHandler<MsgUserInfoProto.ResponseUserInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MsgUserInfoProto.ResponseUserInfo resp) throws Exception {

        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        // 如果是login register的response，将userId记录到本地
        if (resp.getType().equals(MsgUserInfoProto.RequestType.LOGIN) ||
            resp.getType().equals(MsgUserInfoProto.RequestType.REGISTER)){

            // 存放当前用户的userId
            LocalUserData.setUserId(resp.getUserId());

            IOUtils.writeToken(resp.getToken());
            System.out.println(resp.getContent());

            // 如果是选择角色的 response，直接数据结果
        } else if (resp.getType().equals(MsgUserInfoProto.RequestType.STATE)){
            RoleProto.Role role = resp.getRole();

            String typeName = EntityType.getContentFromCode(role.getType()).getContent();
            String aliveName = role.getAlive() == 1 ? "存活" : "死亡";

            System.out.println("当前的角色为：" + role.getName() + " 职业：" + typeName + " 血量：" + role.getHp() +
                    " 状态：" + aliveName + "  金币：" + role.getGold() + "  荣誉值：" + role.getHonor() + "\n");
        }else if (resp.getType().equals(MsgUserInfoProto.RequestType.RELIVE)){
            System.out.println(resp.getContent());

            RoleProto.Role r = resp.getRole();
            System.out.println("当前的角色为：" + r.getName() + "血量：" + r.getHp() + "\n");

        } else if (resp.getType().equals(MsgUserInfoProto.RequestType.EXIT)) {

            // 退出系统成功，删除本地记录
            IOUtils.writeToken("");

            LocalUserData.USERID = 0;
        }
    }
}
