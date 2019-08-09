package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/8/9
 */

public class EmailHandler extends SimpleChannelInboundHandler<MsgEmailProto.ResponseEmail> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgEmailProto.ResponseEmail resp) throws Exception {
        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
        }

        StringBuilder sb = new StringBuilder();
        int type = resp.getTypeValue();
        if (type == MsgEmailProto.RequestType.EMAIL.getNumber()){

            List<EmailProto.Email> emails = resp.getEmailList();
            if (emails.isEmpty()){
                sb.append(resp.getContent());
            }else {
                emails.forEach( e -> {
                    String from = "";

                    long fromId = e.getFromId();
                    if (fromId == 1){
                        from = "系统";
                    }
                    sb.append("id: " + e.getId() + " 发送人：" + from + " 主题: " + e.getTheme() + " 文本：" + e.getContent() + "\n");
                    sb.append("道具如下：\n");
                    sb.append(appGoods(e));

                });
            }
        }else if (type == MsgEmailProto.RequestType.READ.getNumber()){


            List<EmailProto.Email> emails = resp.getEmailList();
            if (emails == null || emails.isEmpty()){
                return;
            }
            sb.append("【你有一条新的邮件通知】\n\n");
            EmailProto.Email e = resp.getEmailList().get(0);
            sb.append("ID: " + e.getId()+ "\n");
            sb.append("主题：" + e.getTheme() + "\n");
            sb.append("发件人：系统\n");
            sb.append("内容：" + e.getContent() + "\n\n");

            sb.append("道具如下：\n");
            sb.append(appGoods(e));

        }else if (type == MsgEmailProto.RequestType.RECEIVE.getNumber()){
            System.out.println(resp.getContent());
            return;
        }

        System.out.println(sb.toString());
    }


    private String appGoods(EmailProto.Email e){

        StringBuilder sb = new StringBuilder();
        List<GoodsProto.Goods> goods = e.getGoodsList();
        goods.forEach( g -> {
            int num = g.getNum();
            ItemsProto.Items i = g.getItem();
            EquipProto.Equip eq = g.getEquip();

            if (i.getItemsId() == 0){
                sb.append("id: " + eq.getEquipId() + " 装备名：" + eq.getName() + " 攻击加成：" + eq.getAUp() + " 技能加成：" + eq.getSpUp() + "\n");
            }else{
                sb.append("id: " + i.getItemsId() + " 道具名：" + i.getName() + " 描述：" + i.getDesc() + " 数量：" + num + "\n");
            }
        });

        return sb.toString();
    }
}
