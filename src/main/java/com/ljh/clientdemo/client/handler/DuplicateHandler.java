package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/7/30
 */
public class DuplicateHandler extends SimpleChannelInboundHandler<MsgDuplicateProto.ResponseDuplicate> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgDuplicateProto.ResponseDuplicate response) throws Exception {
        int result = response.getResult();

        if (result != ResultCode.SUCCESS){
            System.out.println(response.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (response.getTypeValue() == MsgDuplicateProto.RequestType.DUPLICATE.getNumber()){
            if (response.getBossList() != null) {
                List<DuplicateProto.Duplicate> duplicates = response.getDuplicateList();
                duplicates.forEach(d -> {

                    sb.append("副本id：" + d.getId() + " 副本名称：" + d.getName() + " 金币奖励：" + d.getGoldReward() +
                            " 限制时间：" + d.getLimitTime() + "\n\tBoss:\n");

                    List<BossProto.Boss> bosses = d.getBossesList();
                    bosses.forEach(b -> {

                        sb.append("\t\t" + "id: " + b.getId() + " name: " + b.getName() + " hp: " + b.getHp()  + " \n");
                    });

                    sb.append("\n\t奖励装备：\n");

                    List<EquipProto.Equip> equips = d.getEquipsList();
                    equips.forEach(e -> {

                        sb.append("\t\tname: " + e.getName() + " 攻击加成：" + e.getAUp() + " 技能加成：" + + e.getSpUp() +
                                " 血量加成：" + e.getHpUp() + "\n");
                    });
                    sb.append("\n");
                });
            }else {
                sb.append(response.getContent() + "\n");

                DuplicateProto.Duplicate dup = response.getDuplicateList().get(0);
                sb.append("奖励玩家金币：" + dup.getGoldReward() + "\n\n");

                sb.append("奖励玩家装备为：\n");
                List<EquipProto.Equip> equips = response.getEquipList();
                equips.forEach(e -> {
                    sb.append("装备名: " + e.getName() + " 攻击加成：" + e.getAUp() + " 技能加成：" + e.getSpUp() + " 血量加成：" + e.getHpUp() + "\n");
                });
            }
        }else if (response.getTypeValue() == MsgDuplicateProto.RequestType.ENTER.getNumber()){
            sb.append(response.getContent() + "\n");

            BossProto.Boss b = response.getBossList().get(0);
            sb.append("当前需要击杀的 Boss 为： \n");
            sb.append("\t\t id: " + b.getId() + " name: " + b.getName() + " hp: " + b.getHp());
        }else if (response.getTypeValue() == MsgDuplicateProto.RequestType.CHALLENGE.getNumber()){
            sb.append(response.getContent() + "\n");

            if (response.getBossList() != null) {
                BossProto.Boss b = response.getBossList().get(0);
                sb.append("当前的 Boss: " + b.getName() + " Hp = ：" + b.getHp() + "\n");
            }

        }else if (response.getTypeValue() == MsgUserInfoProto.RequestType.EXIT.getNumber()){
            sb.append(response.getContent());
        }

        System.out.println(sb.toString());
    }
}
