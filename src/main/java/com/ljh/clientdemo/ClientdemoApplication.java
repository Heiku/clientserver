package com.ljh.clientdemo;

import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.console.ConsoleCommandManager;
import com.ljh.clientdemo.console.impl.user.LoginConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class ClientdemoApplication {

    private static NettyClient nettyClient;

    @Autowired
    public ClientdemoApplication(NettyClient nettyClient){
        ClientdemoApplication.nettyClient = nettyClient;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientdemoApplication.class, args);
        System.out.println("输入用户名，密码登录：(username,password)");

        ConsoleCommandManager consoleCommandManager = new ConsoleCommandManager();
        LoginConsoleCommand loginConsoleCommand = new LoginConsoleCommand();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNext()){
            // 判断channel中是否属于登录状态
            if (LocalUserData.getUserId() <= 0) {

                // 如果为检测到channel中的session，那么调用登录控制台
                loginConsoleCommand.exec(scanner, nettyClient.getChannel());
            } else {

                // 否则，根据指令调用相应的控制台
                consoleCommandManager.exec(scanner, nettyClient.getChannel());
            }
        }
    }
}
