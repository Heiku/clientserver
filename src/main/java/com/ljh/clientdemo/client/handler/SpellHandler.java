package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.MsgSpellProto;
import com.ljh.clientdemo.proto.protoc.SpellProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/7/11
 */
public class SpellHandler extends SimpleChannelInboundHandler<MsgSpellProto.ResponseSpell> {


    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgSpellProto.ResponseSpell responseSpell) throws Exception {
        if (responseSpell.getResult() == ResultCode.SUCCESS){
            if (responseSpell.getType() == MsgSpellProto.RequestType.SPELL){
                System.out.println(responseSpell.getContent());

                StringBuilder sb = new StringBuilder();
                List<SpellProto.Spell> spells = responseSpell.getOwnList();
                sb.append(responseSpell.getRole().getName() + " : \n");

                if (spells == null || spells.isEmpty()){
                    sb.append("你当前暂未学习任何技能。\n");
                }else {
                    sb.append("你当前已经学习的技能如下：\n");
                    sb.append(appendOwnSpell(responseSpell));
                }

                sb.append("\n你可学习的技能如下：\n");
                sb.append(appendSpell(responseSpell));
                System.out.println(sb.toString());
            }

            else if (responseSpell.getType() == MsgSpellProto.RequestType.LEARN){
                System.out.println(responseSpell.getContent());

                StringBuilder sb = new StringBuilder();
                sb.append(responseSpell.getRole().getName() + "，你当前的技能表如下：\n");
                sb.append(appendSpell(responseSpell));
                System.out.println(sb.toString());
            }
        }
    }

    private String appendSpell(MsgSpellProto.ResponseSpell responseSpell){
        StringBuilder sb = new StringBuilder();

       for (SpellProto.Spell spell : responseSpell.getSpellList()) {
            String range = spell.getRange() == 1 ? "单独伤害" : "范围伤害";
            sb.append("id: " + spell.getSpellId() + " 名字：" + spell.getName() + " 伤害：" + spell.getDamage() +
                    " 消耗法力值：" + spell.getCost() + " 范围：" + range + " cd：" + spell.getCoolDown() + "\n");
        }

        return sb.toString();
    }

    private String appendOwnSpell(MsgSpellProto.ResponseSpell responseSpell){
        StringBuilder sb = new StringBuilder();

        for (SpellProto.Spell spell : responseSpell.getOwnList()) {
            String range = spell.getRange() == 1 ? "单独伤害" : "范围伤害";
            sb.append("id: " + spell.getSpellId() + " 名字：" + spell.getName() + " 伤害：" + spell.getDamage() +
                    " 消耗法力值：" + spell.getCost() + " 范围：" + range + " cd：" + spell.getCoolDown() + "\n");
        }

        return sb.toString();
    }
}
