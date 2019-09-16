package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.proto.protoc.CreepProto;
import com.ljh.clientdemo.proto.protoc.MsgAttackCreepProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author: Heiku
 * @Date: 2019/7/15
 */
public class AttackCreepHandler extends SimpleChannelInboundHandler<MsgAttackCreepProto.ResponseAttackCreep> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgAttackCreepProto.ResponseAttackCreep response) throws Exception {
        if (response.getTypeValue() == MsgAttackCreepProto.RequestType.ATTACK_VALUE){
            System.out.println(response.getContent());
            RoleProto.Role role = response.getRole();
            if (role != null) {
                System.out.println(role.getName() + "当前的血量为：" + role.getHp());
                System.out.println(role.getName() + "当前的蓝量为：" + role.getMp());
            }
        }else if (response.getTypeValue() == MsgAttackCreepProto.RequestType.SPELL_VALUE){
            System.out.println(response.getContent());
            CreepProto.Creep creep = response.getCreep();
            if (!creep.getName().equals("")) {
                System.out.println(creep.getName() + " 的当前的血量为：" + creep.getHp());
            }
        }
    }
}
