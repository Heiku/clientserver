package com.ljh.clientdemo.console;

import com.ljh.clientdemo.console.impl.*;
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
