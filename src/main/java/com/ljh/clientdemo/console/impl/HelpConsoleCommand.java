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

        sb.append("\t login：登录\n");
        sb.append("\t register：注册\n");
        sb.append("\t state：角色绑定\n");
        sb.append("\t site：获取当前角色的位置场景\n");
        sb.append("\t move：移动当前角色\n");
        sb.append("\t aoi：获取当前场景下的所有实体信息\n");

        sb.append("\t date：获取当前的游戏时间\n");
        sb.append("\t talk：与实体 npc 进行对话\n");

        sb.append("\t spell：查看当前技能和所有可学习的技能\n");
        sb.append("\t learn：学习技能\n");

        sb.append("\t attack: 攻击野怪（自动使用普通攻击技能）\n");
        sb.append("\t sp: 使用技能攻击野怪\n");

        sb.append("\t bag: 查看当前背包中的所有道具\n");
        sb.append("\t use: 使用背包中的道具\n");

        sb.append("\t exit：退出当前游戏\n");

        System.out.println(sb.toString());
    }
}
