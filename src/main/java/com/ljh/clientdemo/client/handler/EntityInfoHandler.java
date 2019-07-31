package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.CreepProto;
import com.ljh.clientdemo.proto.protoc.EntityProto;
import com.ljh.clientdemo.proto.protoc.MsgEntityInfoProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

public class EntityInfoHandler extends SimpleChannelInboundHandler<MsgEntityInfoProto.ResponseEntityInfo> {

    @Override
    protected void channelRead0(ChannelHandlerContext channelHandlerContext, MsgEntityInfoProto.ResponseEntityInfo responseEntityInfo) throws Exception {
        if (responseEntityInfo.getResult() != ResultCode.SUCCESS){
            System.out.println(responseEntityInfo.getContent());
        }

        // 返回消息builder
        StringBuilder sb = new StringBuilder("当前场景的实体对象有：\n");

        // 接受entity(List(role), List(entity))
        List<RoleProto.Role> roleList = responseEntityInfo.getRoleList();
        if (roleList.isEmpty()){
            sb.append("当前场景下暂无角色信息\n");
        }
        // 获取所有角色信息
        for (RoleProto.Role role : roleList){
            String playerType = EntityType.getContentFromCode(role.getType()).getContent();
            String playerLevel = String.valueOf(role.getLevel());
            String playerAlive = role.getAlive() == 1 ? "存活" : "死亡";
            String hp = String.valueOf(role.getHp());
            String mp = String.valueOf(role.getMp());
            sb.append("id: " + role.getRoleId() + " 玩家：" + role.getName() + " 职业：" + playerType  + " 血量：" + hp + " 法力值：" + mp + " 等级：" +  playerLevel + " 状态：" + playerAlive + " \n");

        }


        sb.append("\n");
        // 获取实体npc信息
        List<EntityProto.Entity> entityList = responseEntityInfo.getEntityList();
        if (entityList.isEmpty()){
            sb.append("当前场景下暂无角色信息");
        }
        sb.append("npc：\n");
        for (EntityProto.Entity entity : entityList){
            String name = entity.getName();
            String type = EntityType.getContentFromCode(entity.getType()).getContent();
            String level = String.valueOf(entity.getLevel());
            String alive = entity.getAlive() == 1 ? "存活" : "死亡";

            sb.append("名称：" + name + " 职业：" + type + " 等级：" + level + " 状态：" + alive + " \n");
        }


        sb.append("\n");
        // 获取野怪信息
        List<CreepProto.Creep> creepList = responseEntityInfo.getCreepList();
        if (creepList.isEmpty()){
            sb.append("当前场景下暂无野怪信息");
        }
        sb.append("野怪：\n");
        for (CreepProto.Creep creep : creepList){
            String name = creep.getName();
            String type = EntityType.getContentFromCode(creep.getType()).getContent();
            String level = String.valueOf(creep.getLevel());
            String num = String.valueOf(creep.getNum());
            String hp = String.valueOf(creep.getHp());
            String damage = String.valueOf(creep.getDamage());

            sb.append("id: " + creep.getCreepId() + "名称：" + name + " 种类：" + type + " 数量：" + num + " 等级：" + level + " 血量：" + hp + " 攻击力：" + damage + "\n");
        }

        System.out.println(sb.toString());
    }
}
