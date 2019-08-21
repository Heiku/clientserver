package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.MsgRoleProto;
import com.ljh.clientdemo.proto.protoc.RoleInitProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * Role消息返回处理器
 *
 * @Author: Heiku
 * @Date: 2019/8/19
 */
public class RoleHandler extends SimpleChannelInboundHandler<MsgRoleProto.ResponseRole> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgRoleProto.ResponseRole resp) throws Exception {
        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (resp.getTypeValue() == MsgRoleProto.RequestType.ROLE_VALUE){
            RoleProto.Role r = resp.getRole();

            sb.append("当前的角色信息如下：\n\n");
            sb.append("id：" + r.getRoleId() + " 名称：" + r.getName() + " Hp：" + r.getHp() + " Mp：" + r.getMp()  +
                    " 等级： " + r.getLevel() + " 金币：" + r.getGold() +  " 荣誉值：" + r.getHonor() +" \n");

            System.out.println(sb.toString());
        }

        else if (resp.getTypeValue() == MsgRoleProto.RequestType.ROLE_TYPE_VALUE){
            List<RoleInitProto.RoleInit> roleInits = resp.getRoleInitList();

            sb.append("角色职业如下：\n\n");
            roleInits.forEach(r -> {
                sb.append("类型：" + r.getType() + " 名称：" + EntityType.getContentFromCode(r.getType()).getContent() + " Hp：" + r.getHp() +
                        " Mp："+ r.getMp() + " 职业描述：" + r.getDesc() + "\n");
            });
            System.out.println(sb.toString());
        }else {
            System.out.println(resp.getContent());
        }
    }
}
