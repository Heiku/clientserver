package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.GroupProto;
import com.ljh.clientdemo.proto.protoc.MsgGroupProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * 组队消息返回处理器
 *
 * @Author: Heiku
 * @Date: 2019/8/14
 */
public class GroupHandler extends SimpleChannelInboundHandler<MsgGroupProto.ResponseGroup> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgGroupProto.ResponseGroup resp) throws Exception {
        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (resp.getType().equals(MsgGroupProto.RequestType.STATE_GROUP)){
            sb.append(resp.getContent() + "\n");

            GroupProto.Group group = resp.getGroup();
            RoleProto.Role leader = group.getLeader();
            List<RoleProto.Role> members = group.getMembersList();

            sb.append("当前的队伍信息如下：\n");
            sb.append("队长：" + leader.getName() + " 等级：" + leader.getLevel() + " 荣誉值：" + leader.getHonor() + "\n");
            members.forEach(m -> {
                if (m.getRoleId() != leader.getRoleId()){
                    sb.append("成员："+ m.getName() + " 等级：" + m.getLevel() + " 荣誉值：" + m.getHonor() + "\n");
                }
            });

            System.out.println(sb.toString());
        }else {
            System.out.println(resp.getContent());
        }

    }
}
