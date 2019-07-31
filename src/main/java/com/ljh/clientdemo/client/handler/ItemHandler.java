package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.EntityType;
import com.ljh.clientdemo.command.PartType;
import com.ljh.clientdemo.proto.protoc.EquipProto;
import com.ljh.clientdemo.proto.protoc.ItemsProto;
import com.ljh.clientdemo.proto.protoc.MsgItemProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/7/16
 */
public class ItemHandler extends SimpleChannelInboundHandler<MsgItemProto.ResponseItem> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgItemProto.ResponseItem responseItem) throws Exception {
        System.out.println(responseItem.getContent());

        if (responseItem.getType() == MsgItemProto.RequestType.ALL){
            List<ItemsProto.Items> items = responseItem.getItemList();
            List<EquipProto.Equip> equips = responseItem.getEquipList();

            StringBuilder sb = new StringBuilder();
            sb.append("当前背包中的物品如下：\n");
            for (ItemsProto.Items i : items){
                sb.append("id: " + i.getItemsId() + " 名称: " + i.getName() + "恢复时间：" + i.getSec() + " 数量: " +  i.getNum() + " 描述: " + i.getDesc() + " \n");
            }

            sb.append("当前的背包中的装备如下：\n");
            for (EquipProto.Equip equip : equips) {
                sb.append("id: " + equip.getEquipId() + " 名称：" + equip.getName() + " 部位： " + PartType.getContentByCode(equip.getPart()) +
                        " 类型：" + EntityType.getContentFromCode(equip.getType()).getContent() + " 伤害加成：" + equip.getAUp() +
                        " 技能加成：" + equip.getSpUp() + " 血量加成：" + equip.getHpUp() + " \n");
            }

            System.out.println(sb.toString());
        }
    }
}
