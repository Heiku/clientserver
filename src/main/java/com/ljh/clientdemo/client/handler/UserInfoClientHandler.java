package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.RoleInfoProto;
import com.ljh.clientdemo.proto.UserInfoProto;
import com.ljh.clientdemo.utils.IOUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class UserInfoClientHandler extends SimpleChannelInboundHandler<UserInfoProto.ResponseUserInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, UserInfoProto.ResponseUserInfo responseUserInfo) throws Exception {
        // 先输出返回的消息
        System.out.println(responseUserInfo.getContent());

        // 如果是login register的response，将userId记录到本地
        if (responseUserInfo.getType().equals(UserInfoProto.RequestType.LOGIN) ||
            responseUserInfo.getType().equals(UserInfoProto.RequestType.REGISTER)){

            // 存放当前用户的userId
            LocalUserData.USERID = responseUserInfo.getUserId();
        }

        // 如果是选择角色的 response，直接数据结果
        else if (responseUserInfo.getType().equals(UserInfoProto.RequestType.STATE)){
            RoleInfoProto.Role role = responseUserInfo.getRole();

            String typeName = EntityType.getContentFromCode(role.getType()).getContent();
            String aliveName = role.getAlive() == 1 ? "存活" : "死亡";

            System.out.println("当前的角色为：" + role.getName() + " 职业：" + typeName + " 等级：" + role.getLevel() +
                    " 状态：" + aliveName + "\n");
        }

        else if (responseUserInfo.getType().equals(UserInfoProto.RequestType.EXIT)){

            // 退出系统成功，删除本地记录
            IOUtils.writeToken("");

            LocalUserData.USERID = 0;
        }
    }
}
