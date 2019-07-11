package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.MsgSpellProto;
import com.ljh.clientdemo.proto.protoc.SpellProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * @Author: Heiku
 * @Date: 2019/7/11
 */
public class SpellHandler extends SimpleChannelInboundHandler<MsgSpellProto.ResponseSpell> {

    private StringBuilder sb = new StringBuilder();

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgSpellProto.ResponseSpell responseSpell) throws Exception {
        if (responseSpell.getResult() == ResultCode.SUCCESS){
            if (responseSpell.getType() == MsgSpellProto.RequestType.SPELL){
                System.out.println(responseSpell.getContent());

                sb.append(responseSpell.getRole().getName() + "，你可学习地技能如下：\n");
                sb.append(appendSpell(responseSpell));
            }

            else if (responseSpell.getType() == MsgSpellProto.RequestType.LEARN){
                System.out.println(responseSpell.getContent());

                sb.append(responseSpell.getRole().getName() + "，你当前地技能表如下：\n");
                sb.append(appendSpell(responseSpell));
            }
        }
    }

    private String appendSpell(MsgSpellProto.ResponseSpell responseSpell){
        for (SpellProto.Spell spell : responseSpell.getSpellList()) {
            String range = spell.getRange() == 1 ? "单独伤害" : "范围伤害";
            sb.append("id: " + spell.getSpellId() + " 名字：" + spell.getName() + " 伤害：" + spell.getDamage() +
                    " 消耗法力值：" + spell.getCost() + " 范围：" + range + " cd：" + spell.getCoolDown());
        }

        return sb.toString();
    }
}
