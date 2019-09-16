package com.ljh.clientdemo.console.impl;

import com.ljh.clientdemo.console.ConsoleCommand;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 发送help指令，获取指令列表
 */
public class HelpConsoleCommand implements ConsoleCommand {

    @Override
    public void exec(Scanner scanner, Channel channel) {
        StringBuilder sb = new StringBuilder("当前游戏支持的指令包括：\n");

        sb.append("用户相关：\n");
        sb.append("\t login：登录\n");
        sb.append("\t register：注册\n");
        sb.append("\t state：角色绑定\n");

        sb.append("角色相关：\n");
        sb.append("\t role: 查看当前的角色状态\n");
        sb.append("\t rt: 展示所有的角色类型\n");
        sb.append("\t create: 创建对应的玩家角色信息\n");

        sb.append("场景：\n");
        sb.append("\t site：获取当前角色的位置场景\n");
        sb.append("\t move：移动当前角色\n");


        sb.append("辅助：\n");
        sb.append("\t aoi：获取当前场景下的所有实体信息\n");
        sb.append("\t date：获取当前的游戏时间\n");
        sb.append("\t talk：与实体 npc 进行对话\n");

        sb.append("技能：\n");
        sb.append("\t spell：查看当前技能和所有可学习的技能\n");
        sb.append("\t learn：学习技能\n");

        sb.append("野怪：\n");
        sb.append("\t spCreep: 使用技能攻击野怪\n");
        sb.append("\t stopCreep: 离开野怪的攻击范围\n");

        sb.append("背包道具：\n");
        sb.append("\t bag: 查看当前背包中的所有道具\n");
        sb.append("\t use: 使用背包中的道具\n");

        sb.append("装备：\n");
        sb.append("\t equip: 查看当前玩家所拥有的装备信息\n");
        sb.append("\t put: 穿戴装备\n");
        sb.append("\t takeOff: 卸下装备\n");
        sb.append("\t fix: 修理装备\n");

        sb.append("副本：\n");
        sb.append("\t duplicate: 查看当前的所有副本信息：\n");
        sb.append("\t enter: 挑战副本\n");
        sb.append("\t spBoss: 对 Boss 施放技能\n");
        sb.append("\t stopBoss: 离开 Boss 的攻击范围\n");
        sb.append("\t leaveBoss: 退出副本挑战\n");

        sb.append("商城：\n");
        sb.append("\t mall: 查看当前的商城信息\n");
        sb.append("\t buy: 购买商品\n");

        sb.append("聊天：\n");
        sb.append("\t chat: 与玩家进行聊天 \n");
        sb.append("\t chatGroup: 与全服的玩家进行聊天 \n");

        sb.append("邮件：\n");
        sb.append("\t email: 获取邮件列表\n ");
        sb.append("\t receive: 接收邮件物品 \n");

        sb.append("PK：\n");
        sb.append("\t pk: 邀请玩家进行pk\n");
        sb.append("\t acceptPK：接受 pk 挑战\n");
        sb.append("\t spr: 使用技能攻击玩家\n");
        sb.append("\t escape: 离开当前的pk挑战，本场将被判为战败\n");

        sb.append("组队：\n");
        sb.append("\t groupState: 查看组队状态\n");
        sb.append("\t group: 发起组队邀请\n");
        sb.append("\t join: 接受组队的邀请，加入队伍\n");
        sb.append("\t exit: 退出队伍\n");

        sb.append("面对面交易：\n");
        sb.append("\t initiate: 交易发起\n");
        sb.append("\t yes: 接受交易\n");
        sb.append("\t no: 拒绝交易的申请\n");
        sb.append("\t ask: 发送交易内容\n");
        sb.append("\t accept: 确认交易\n");
        sb.append("\t refuse: 拒绝交易\n");
        sb.append("\t leaveTrade: 离开交易\n");

        sb.append("公会：\n");
        sb.append("\t guid: 查看当前所在的公会信息\n");
        sb.append("\t guildAll: 查看当前世界的所有公会\n");
        sb.append("\t establish: 建立公会\n");
        sb.append("\t applyGuild: 申请加入公会\n");
        sb.append("\t applyAll: 查看所有的申请列表\n");
        sb.append("\t approvalYes: 同意审批公会申请\n");
        sb.append("\t approvalNo: 拒绝审批公会申请\n");
        sb.append("\t modifyAnn: 修改公告\n");
        sb.append("\t give: 赋予职位\n" );
        sb.append("\t donate: 捐献公会物品\n");
        sb.append("\t takeOut: 取出公会物品\n");
        sb.append("\t kickOut: 踢出公会\n");
        sb.append("\t exitGuild: 退出公会\n");

        sb.append("交易行：\n");
        sb.append("\t tradeState: 查看当前的交易状态\n");
        sb.append("\t fixedPriceAll: 查看所有一口价的拍卖物品\n");
        sb.append("\t auctionAll: 查看所有正在拍卖的物品\n");
        sb.append("\t putGoods: 上架商品\n");
        sb.append("\t buyFixedPrice: 购买一口价的物品\n");
        sb.append("\t buyAuction: 进行物品的拍卖\n");
        sb.append("\t outOf: 将物品进行下架处理\n");

        sb.append("任务：\n");
        sb.append("\t taskAll: 查看所有的任务列表\n");
        sb.append("\t taskState: 查看当前任务的状态信息\n");
        sb.append("\t taskReceive: 接受任务\n");
        sb.append("\t taskSubmit: 提交任务\n");
        sb.append("\t taskGiveUp: 放弃任务\n");

        sb.append("\n\t quit：退出当前游戏\n");

        System.out.println(sb.toString());
    }
}
