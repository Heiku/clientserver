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
        ConsoleCommandManager consoleCommandManager = new ConsoleCommandManager();

        System.out.println("Welcome to The Legend of ZhaZha");
        System.out.println("input 【help】 and press Enter can get what you want");
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            consoleCommandManager.exec(scanner, nettyClient.getChannel());
        }
    }
}
