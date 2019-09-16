package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.GoodsProto;
import com.ljh.clientdemo.proto.protoc.MsgTradeProto;
import com.ljh.clientdemo.proto.protoc.TradeProto.Trade;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/8/30
 */
public class TradeHandler extends SimpleChannelInboundHandler<MsgTradeProto.ResponseTrade> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgTradeProto.ResponseTrade resp) throws Exception {
        int result = resp.getResult();
        if (result != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        int type = resp.getTypeValue();
        StringBuilder sb = new StringBuilder();
        if (type == MsgTradeProto.RequestType.TRADE_STATE_VALUE){
            List<Trade> tradeList = resp.getTradeList();
            if (tradeList == null || tradeList.isEmpty()){
                System.out.println("当前暂无交易信息！");
                return;
            }

            sb.append("当前正在参与的交易如下：\n\n");
            tradeList.forEach(t -> {
                String name = "";
                GoodsProto.Goods goods = t.getGoods();
                if (goods.getEquip() == null || goods.getEquip().getName().equals("")){
                    name = goods.getItem().getName();
                }else {
                    name = goods.getEquip().getName();
                }

                if (t.getType() == 1) {
                    sb.append("【一口价】 id: " + t.getTradeId() + " 物品：" + name + " 数量：" + t.getNum() +
                            " 卖家：" + t.getSeller().getName() + " 交易价格：" + t.getPrice() + " 剩余交易时间：" + t.getRemainTime() + "s\n");
                }
                String buyName = t.getBuyer().getName().equals("") ? "暂无竞拍人" : t.getBuyer().getName();
                sb.append("【竞拍】 id: " + t.getTradeId() + " 物品：" + name + " 数量：" + t.getNum() +
                        " 卖家：" + t.getSeller().getName() + " 竞拍人：" + buyName  +" 交易价格：" + t.getPrice() + " 剩余交易时间：" + t.getRemainTime() + "s\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgTradeProto.RequestType.FIXED_PRICE_ALL_VALUE){
            List<Trade> tradeList = resp.getTradeList();
            if (tradeList.isEmpty()){
                System.out.println("当前暂无交易信息！");
                return;
            }

            sb.append("当前的一口价交易如下：\n\n");
            tradeList.forEach(t -> {
                String name = "";
                GoodsProto.Goods goods = t.getGoods();
                if (goods.getEquip() == null || goods.getEquip().getName().equals("")){
                    name = goods.getItem().getName();
                }else {
                    name = goods.getEquip().getName();
                }

                sb.append("【一口价】 id: " + t.getTradeId() + " 物品：" + name + " 数量：" + t.getNum() +
                        " 卖家：" + t.getSeller().getName() + " 交易价格：" + t.getPrice() + " 剩余交易时间：" + t.getRemainTime() + "s\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgTradeProto.RequestType.AUCTION_ALL_VALUE){
            List<Trade> tradeList = resp.getTradeList();
            if (tradeList.isEmpty()){
                System.out.println("当前暂无交易信息！");
                return;
            }

            sb.append("当前的拍卖交易如下：\n\n");
            tradeList.forEach(t -> {
                String name = "";
                GoodsProto.Goods goods = t.getGoods();
                if (goods.getEquip() == null || goods.getEquip().getName().equals("")){
                    name = goods.getItem().getName();
                }else {
                    name = goods.getEquip().getName();
                }
                String buyName = t.getBuyer().getName().equals("") ? "暂无竞拍人" : t.getBuyer().getName();
                sb.append("【竞拍】 id: " + t.getTradeId() + " 物品：" + name + " 数量：" + t.getNum() +
                        " 卖家：" + t.getSeller().getName() + " 竞拍人：" + buyName  +" 交易价格：" + t.getPrice() + " 剩余交易时间：" + t.getRemainTime() + "s\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgTradeProto.RequestType.COMMON_TRADE_VALUE){
            System.out.println(resp.getContent());
        }
    }
}
