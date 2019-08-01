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

        sb.append("\n\t exit：退出当前游戏\n");

        System.out.println(sb.toString());
    }
}
