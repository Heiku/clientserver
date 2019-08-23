package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.command.PartType;
import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.EquipProto;
import com.ljh.clientdemo.proto.protoc.MsgEquipProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/7/25
 */
public class EquipHandler extends SimpleChannelInboundHandler<MsgEquipProto.ResponseEquip> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgEquipProto.ResponseEquip response) throws Exception {
        if (response.getResult() != ResultCode.SUCCESS){
            System.out.println(response.getContent());
            return;
        }
        MsgEquipProto.RequestType type = response.getType();
        StringBuilder sb = new StringBuilder();

        if (type == MsgEquipProto.RequestType.EQUIP){
            List<EquipProto.Equip> ownList = response.getOwnList();
            List<EquipProto.Equip> allList = response.getEquipList();

            sb.append("当前玩家的已装备如下：\n");
            sb.append(appendEquipInfo(ownList));

            sb.append("当前玩家的全部装备如下：\n");
            sb.append(appendEquipInfo(allList));

        }else if (type == MsgEquipProto.RequestType.PUT){
            RoleProto.Role role = response.getRole();
            List<EquipProto.Equip> ownList = response.getOwnList();

            sb.append(response.getContent());
            sb.append("玩家：" + role.getName() + " 已穿戴的装备如下: \n");
            sb.append(appendEquipInfo(ownList));

        }else if (type == MsgEquipProto.RequestType.TAKEOFF){
            RoleProto.Role role = response.getRole();
            List<EquipProto.Equip> ownList = response.getOwnList();

            sb.append(response.getContent());
            sb.append("玩家：" + role.getName() + " 已穿戴的装备如下: \n");
            sb.append(appendEquipInfo(ownList));

        }else if (type == MsgEquipProto.RequestType.FIX){
            sb.append(response.getContent());
        }

        System.out.println(sb.toString());
    }

    private String appendEquipInfo(List<EquipProto.Equip> list){
        StringBuilder sb = new StringBuilder();
        for (EquipProto.Equip e : list) {
            sb.append("id: " + e.getId() + "装备号：" + e.getEquipId() + " 装备名：" + e.getName() + " 职业：" + EntityType.getContentFromCode(e.getType()).getContent() +
                    " 类别：" + PartType.getContentByCode(e.getPart()) + " 等级：" + e.getLevel() + " 普攻加成：" + e.getAUp() +
                    " 技能加成：" + e.getSpUp() + " 生命值加成：" + e.getHpUp() + " 耐久度：" + e.getDurability() +
                    " 可用状态：" + e.getState() + " \n");
        }
        return sb.toString();
    }
}
