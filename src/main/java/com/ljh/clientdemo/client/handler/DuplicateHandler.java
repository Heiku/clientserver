package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.BossProto;
import com.ljh.clientdemo.proto.protoc.DuplicateProto;
import com.ljh.clientdemo.proto.protoc.EquipProto;
import com.ljh.clientdemo.proto.protoc.MsgDuplicateProto;
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
            List<DuplicateProto.Duplicate> duplicates = response.getDuplicateList();
            duplicates.forEach(d -> {

                sb.append("副本id：" + d.getId() + " 副本名称：" + d.getName() + " 金币奖励：" + d.getGoldReward() +
                        " 限制时间：" + d.getLimitTime() + "\n\tBoss:\n");

                List<BossProto.Boss> bosses = d.getBossesList();
                bosses.forEach(b -> {

                    sb.append("\t\tname: " + b.getName() + " hp: " + b.getHp()  + " \n");
                });

                sb.append("\n\t奖励装备：\n");

                List<EquipProto.Equip> equips = d.getEquipsList();
                equips.forEach(e -> {

                    sb.append("\t\tname: " + e.getName() + " 攻击加成：" + e.getAUp() + " 技能加成：" + + e.getSpUp() +
                            " 血量加成：" + e.getHpUp() + "\n");
                });
                sb.append("\n");
            });
        }

        System.out.println(sb.toString());
    }
}
