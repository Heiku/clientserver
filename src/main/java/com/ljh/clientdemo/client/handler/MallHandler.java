package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.CommodityProto;
import com.ljh.clientdemo.proto.protoc.EquipProto;
import com.ljh.clientdemo.proto.protoc.ItemsProto;
import com.ljh.clientdemo.proto.protoc.MsgMallProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/8/5
 */
public class MallHandler extends SimpleChannelInboundHandler<MsgMallProto.ResponseMall> {

    public static final int ITEM = 1;

    public static final int EQUIP = 2;

    private StringBuilder sb = new StringBuilder();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgMallProto.ResponseMall response) throws Exception {
        if (response.getResult() != ResultCode.SUCCESS){
            System.out.println(response.getContent());
            return;
        }

        if (response.getType() == MsgMallProto.RequestType.MALL){
            List<CommodityProto.Commodity> commodityList = response.getCommodityList();

            sb.append("商店的商品如下：（再次发送 mall 指令可刷新商品的信息）\n\n");
            commodityList.forEach(c -> {
                if (c.getType() == ITEM){
                    ItemsProto.Items items = c.getItem();
                    sb.append("物品id：" + items.getItemsId() + " 物品名：" + items.getName() + " 价格：" + c.getPrice()
                            + " 限购：" + c.getLimit() + " 描述：" + items.getDesc() + "\n");

                }else if (c.getType() == EQUIP){
                    EquipProto.Equip e = c.getEquip();
                    sb.append("装备id：" + e.getEquipId() + " 装备名：" + e.getName() + " 价格：" + c.getPrice() +
                            " 限购：" + c.getLimit() + " 攻击加成：" + e.getAUp() + " 技能加成：" + e.getSpUp() +
                            " 血量加成：" + e.getHpUp() + "\n"
                    );
                }
            });

            sb.append("\n");
            System.out.println(sb.toString());
        }else {
            System.out.println(response.getContent());
        }


    }
}
