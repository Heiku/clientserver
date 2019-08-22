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
        sb.append("\t attackc: 攻击野怪（自动使用普通攻击技能）\n");
        sb.append("\t spc: 使用技能攻击野怪\n");
        sb.append("\t sps: 使用技能buff自己\n");
        sb.append("\t stopc: 离开野怪的攻击范围\n");

        sb.append("背包道具：\n");
        sb.append("\t bag: 查看当前背包中的所有道具\n");
        sb.append("\t use: 使用背包中的道具\n");

        sb.append("装备：\n");
        sb.append("\t equip: 查看当前玩家所拥有的装备信息\n");
        sb.append("\t put: 穿戴装备\n");
        sb.append("\t takeoff: 卸下装备\n");
        sb.append("\t fix: 修理装备\n");

        sb.append("副本：\n");
        sb.append("\t duplicate: 查看当前的所有副本信息：\n");
        sb.append("\t enter: 挑战副本\n");
        sb.append("\t attackb: 攻击 Boss\n");
        sb.append("\t spb: 对 Boss 施放技能\n");
        sb.append("\t stopb: 离开 Boss 的攻击范围\n");
        sb.append("\t leave: 退出副本挑战\n");

        sb.append("商城：\n");
        sb.append("\t mall: 查看当前的商城信息\n");
        sb.append("\t buy: 购买商品\n");

        sb.append("聊天：\n");
        sb.append("\t chat: 与玩家进行聊天 \n");
        sb.append("\t chatg: 与全服的玩家进行聊天 \n");

        sb.append("邮件：\n");
        sb.append("\t email: 获取邮件列表\n ");
        sb.append("\t receive: 接收邮件物品 \n");

        sb.append("PK：\n");
        sb.append("\t pk: 邀请玩家进行pk\n");
        sb.append("\t ac：接受 pk 挑战\n");
        sb.append("\t spr: 使用技能攻击玩家\n");
        sb.append("\t escape: 离开当前的pk挑战，本场将被判为战败\n");

        sb.append("组队：\n");
        sb.append("\t gs: 查看组队状态\n");
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
        sb.append("\t lt: 离开交易\n");

        sb.append("\n\t quit：退出当前游戏\n");

        System.out.println(sb.toString());
    }
}
