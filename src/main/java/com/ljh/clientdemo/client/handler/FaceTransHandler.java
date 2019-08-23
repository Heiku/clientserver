package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author: Heiku
 * @Date: 2019/8/23
 */
public class FaceTransHandler extends SimpleChannelInboundHandler<MsgFaceTransProto.ResponseFaceTrans> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgFaceTransProto.ResponseFaceTrans resp) throws Exception {
        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        if (resp.getTypeValue() == MsgFaceTransProto.RequestType.INITIATE_VALUE){
            System.out.println(resp.getContent());
        }

        else if (resp.getTypeValue() == MsgFaceTransProto.RequestType.ASK_TRANS_VALUE){
            TransProto.Trans trans = resp.getTrans();
            GoodsProto.Goods goods = trans.getGoods();

            sb.append("玩家：【 " + trans.getPromoter().getName() + " 】向你发来交易订单 \n\n");

            sb.append("交易内容：\n");
            sb.append("\t\t交易id：" + trans.getId() + "\n");
            if (goods.getEquip().getName().equals("")){
                ItemsProto.Items items = goods.getItem();
                sb.append("\t\t物品：" + items.getName() + "\n");
            }else {
                EquipProto.Equip equip = goods.getEquip();
                sb.append("\t\t物品：" + equip.getName() + "\n");
            }
            sb.append("\t\t数量：" + goods.getNum() + "\n");
            sb.append("\t\t交易金额：" + trans.getAmount() + "\n\n\n");

            sb.append("同意订单交易请输入：【accept】 + id \n");
            sb.append("拒绝订单交易请输入：【refuse】 + id \n\n");
            System.out.println(sb.toString());
        }
    }
}
