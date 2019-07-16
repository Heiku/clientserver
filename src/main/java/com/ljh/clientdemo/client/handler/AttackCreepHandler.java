package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.proto.protoc.CreepProto;
import com.ljh.clientdemo.proto.protoc.MsgAttackCreepProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author: Heiku
 * @Date: 2019/7/15
 */
public class AttackCreepHandler extends SimpleChannelInboundHandler<MsgAttackCreepProto.ResponseAttackCreep> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgAttackCreepProto.ResponseAttackCreep response) throws Exception {
        System.out.println(response.getContent());

        CreepProto.Creep creep = response.getCreep();
        System.out.println(creep.getName() + " 的当前的血量为：" + creep.getHp());
    }
}
