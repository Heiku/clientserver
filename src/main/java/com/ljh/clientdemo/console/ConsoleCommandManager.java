package com.ljh.clientdemo.console;

import com.ljh.clientdemo.console.impl.*;
import com.ljh.clientdemo.console.impl.creep.AttackCreepConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.AttackCreepSpellConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.SpellToSaveConsoleCommand;
import com.ljh.clientdemo.console.impl.creep.StopAttackCreepConsoleCommand;
import com.ljh.clientdemo.console.impl.duplicate.*;
import com.ljh.clientdemo.console.impl.equip.EquipAllConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipFixConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipPutConsoleCommand;
import com.ljh.clientdemo.console.impl.equip.EquipTakeOffConsoleCommand;
import com.ljh.clientdemo.console.impl.item.BagAllConsoleCommand;
import com.ljh.clientdemo.console.impl.item.UseItemConsoleCommand;
import com.ljh.clientdemo.console.impl.others.DateConsoleCommand;
import com.ljh.clientdemo.console.impl.site.MoveConsoleCommand;
import com.ljh.clientdemo.console.impl.site.SiteConsoleCommand;
import com.ljh.clientdemo.console.impl.user.StateConsoleCommand;
import com.ljh.clientdemo.console.impl.others.TalkEntityConsoleCommand;
import com.ljh.clientdemo.console.impl.spell.LearnSpellConsoleCommand;
import com.ljh.clientdemo.console.impl.spell.SpellConsoleCommand;
import com.ljh.clientdemo.console.impl.user.AoiConsoleCommand;
import com.ljh.clientdemo.console.impl.user.ExitConsoleCommand;
import com.ljh.clientdemo.console.impl.user.LoginConsoleCommand;
import com.ljh.clientdemo.console.impl.user.RegisterConsoleCommand;
import io.netty.channel.Channel;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleCommandManager implements ConsoleCommand {

    private Map<String, ConsoleCommand> consoleCommandMap;

    public ConsoleCommandManager(){
        consoleCommandMap = new HashMap<>();

        consoleCommandMap.put("help", new HelpConsoleCommand());
        consoleCommandMap.put("date", new DateConsoleCommand());

        consoleCommandMap.put("login", new LoginConsoleCommand());
        consoleCommandMap.put("register", new RegisterConsoleCommand());
        consoleCommandMap.put("site", new SiteConsoleCommand());
        consoleCommandMap.put("move", new MoveConsoleCommand());
        consoleCommandMap.put("state", new StateConsoleCommand());
        consoleCommandMap.put("aoi", new AoiConsoleCommand());

        consoleCommandMap.put("talk", new TalkEntityConsoleCommand());

        consoleCommandMap.put("spell", new SpellConsoleCommand());
        consoleCommandMap.put("learn", new LearnSpellConsoleCommand());

        // attack
        consoleCommandMap.put("attackc", new AttackCreepConsoleCommand());
        consoleCommandMap.put("spc", new AttackCreepSpellConsoleCommand());
        consoleCommandMap.put("sps", new SpellToSaveConsoleCommand());
        consoleCommandMap.put("stopc", new StopAttackCreepConsoleCommand());

        // bag
        consoleCommandMap.put("bag", new BagAllConsoleCommand());
        consoleCommandMap.put("use", new UseItemConsoleCommand());

        // equip
        consoleCommandMap.put("equip", new EquipAllConsoleCommand());
        consoleCommandMap.put("put", new EquipPutConsoleCommand());
        consoleCommandMap.put("takeoff", new EquipTakeOffConsoleCommand());
        consoleCommandMap.put("fix", new EquipFixConsoleCommand());

        // duplicate boss
        consoleCommandMap.put("duplicate", new DuplicateConsoleCommand());
        consoleCommandMap.put("enter", new EnterDuplicateConsoleCommand());
        consoleCommandMap.put("attackb", new AttackBossConsoleCommand());
        consoleCommandMap.put("spb", new SpellToBossConsoleCommand());
        consoleCommandMap.put("stopb", new StopDuplicateConsoleCommand());
        consoleCommandMap.put("leave", new LeaveDuplicateConsoleCommand());

        consoleCommandMap.put("exit", new ExitConsoleCommand());

    }

    @Override
    public void exec(Scanner scanner, Channel channel) {
        // 获取指令
        String command = scanner.next();

        // 获取指令对应的执行
        ConsoleCommand consoleCommand = consoleCommandMap.get(command);
        if (consoleCommand != null){
            consoleCommand.exec(scanner, channel);
        }else {
            System.err.println("无法识别["  + command + "]指令，请重新输入!");
        }
    }
}
