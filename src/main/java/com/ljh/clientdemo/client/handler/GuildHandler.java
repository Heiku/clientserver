package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.MemberType;
import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.*;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/8/26
 */
public class GuildHandler extends SimpleChannelInboundHandler<MsgGuildProto.ResponseGuild> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgGuildProto.ResponseGuild resp) throws Exception {
        int result = resp.getResult();
        if (result != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        int type = resp.getTypeValue();
        StringBuilder sb = new StringBuilder();
        if (type == MsgGuildProto.RequestType.GUILD_VALUE){
            List<GuildProto.Guild> guilds = resp.getGuildList();
            GuildProto.Guild g = guilds.get(0);

            sb.append("当前公会信息如下：\n\n");
            sb.append("\t\t公会id：" + g.getGuildId() + "\n");
            sb.append("\t\t公会名：" + g.getName() + "\n");
            sb.append("\t\t公会公告：" + g.getBulletin() + "\n");
            sb.append("\t\t公会等级：" + g.getLevel() + "\n");
            sb.append("\t\t公会人数：" + g.getNum() + "/" + g.getMaxNum() + " \n");
            RoleProto.Role role = g.getPresident();
            sb.append("\t\t会长：" + role.getName() + " 等级：" + role.getLevel() + " 荣誉值：" + role.getHonor() + "\n\n");

            sb.append("公会成员：\n");
            List<GuildMemberProto.GuildMember> members = g.getMemberList();
            members.forEach(m -> {
                RoleProto.Role r = m.getRole();
                sb.append("\t\tid: " + r.getRoleId() + " 昵称：" + r.getName() + " 等级：" + r.getLevel() + " 职位：" + MemberType.getPositionNameByCode(m.getPosition()) + "\n");
            });

            sb.append("公会仓库：\n");
            List<GoodsProto.Goods> goods = resp.getGoodsList();
            goods.forEach(go -> {
                if (go.getEquip().getName().equals("")){
                    ItemsProto.Items items = go.getItem();
                    sb.append("\t\t物品：" + items.getName() + "数量：" + go.getNum() + "\n");
                }else {
                    EquipProto.Equip equip = go.getEquip();
                    sb.append("\t\t物品：" + equip.getName() + "数量：" + go.getNum() + "\n");
                }
            });

            System.out.println(sb.toString());
        }


        else if (type == MsgGuildProto.RequestType.GUILD_ALL_VALUE){
            List<GuildProto.Guild> guilds = resp.getGuildList();
            if (guilds.isEmpty()){
                System.out.println("当前世界暂无公会信息，快去创建公会吧！\n");
                return;
            }
            sb.append("当前世界公会信息如下：\n\n");
            guilds.forEach(g -> {
                sb.append("公会id：" + g.getGuildId() + " 公会名：" + g.getName() + " 等级：" + g.getLevel() + " 公会人数：" + g.getNum() + "/" + g.getMaxNum() +
                        " 会长：" + g.getPresident().getName() +  "\n");
            });
            System.out.println(sb.toString());
        }


        else if (type == MsgGuildProto.RequestType.APPLY_ALL_VALUE){
            List<GuildApplyProto.GuildApply> applies = resp.getApplyList();
            if (applies.isEmpty()){
                System.out.println("暂无玩家申请加入公会！\n");
                return;
            }
            sb.append("公会申请信息如下：\n\n");
            applies.forEach(ga ->  {
                sb.append("申请id：" + ga.getId() + " 申请人：" + ga.getApplicant().getName() + " 申请人等级：" + ga.getApplicant().getLevel() +
                        " 申请人荣誉值：" + ga.getApplicant().getHonor() + " 申请时间：" + ga.getApplyTime() + "\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgGuildProto.RequestType.COMMON_GUILD_VALUE){
            System.out.println(resp.getContent());
        }
    }
}
