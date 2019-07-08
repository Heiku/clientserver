package com.ljh.clientdemo;

import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.console.ConsoleCommandManager;
import com.ljh.clientdemo.console.impl.LoginConsoleCommand;
import com.ljh.clientdemo.local.LocalUserData;
import io.netty.channel.Channel;
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

        // 启动读取命令线程，开始读取用户指令
        startConsoleThread(nettyClient.getChannel());
        }


    /**
     * 开启一个控制台线程
     *
     * @param channel
     */
    private static void startConsoleThread(Channel channel){
        ConsoleCommandManager consoleCommandManager = new ConsoleCommandManager();
        LoginConsoleCommand loginConsoleCommand = new LoginConsoleCommand();
        Scanner scanner = new Scanner(System.in);

        new Thread(() -> {
            while (!Thread.interrupted()) {

                // 判断channel中是否属于登录状态
                // TODO: 后期可以将 token 信息写入到 channel 的attr中
                if (LocalUserData.getUserId() <= 0) {

                    // 如果为检测到channel中的session，那么调用登录控制台
                    loginConsoleCommand.exec(scanner, channel);
                } else {

                    // 否则，根据指令调用相应的控制台
                    consoleCommandManager.exec(scanner, channel);
                }

            }
        }).start();
    }
}
