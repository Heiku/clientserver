package com.ljh.clientdemo;

import com.ljh.clientdemo.service.RequestService;
import com.ljh.clientdemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.ljh.clientdemo.command.CommandType.*;

@SpringBootApplication
public class ClientdemoApplication {

    private static RequestService requestService;

    private static UserService userService;

    /**
     * 采用构造方法的方式将 对象注入到容器中
     *
     * @param requestService
     * @param userService
     */
    @Autowired
    public ClientdemoApplication(RequestService requestService, UserService userService){
        ClientdemoApplication.requestService = requestService;
        ClientdemoApplication.userService = userService;
    }

    public static void main(String[] args) {
        SpringApplication.run(ClientdemoApplication.class, args);

        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()){
            String cmd = sc.nextLine();

            moveInterceptor(cmd);
            loginInterceptor(cmd);
            registerInterceptor(cmd);

            cmd = cmd.toLowerCase().trim();
            switch (cmd){
                case SITE:
                    requestService.getSite();
                    break;
                case DATE:
                    requestService.getDate();
                    break;
                case NOW:
                    requestService.getDate();
                    break;
                case AOI:
                    requestService.getAOI();
                    break;
                case STATE:
                    userService.getUserState();
                    break;
                case EXIT:
                    requestService.exit();
                    break;
            }
        }
    }

    private static void moveInterceptor(String cmd) {
        CharSequence moveChar = MOVE;
        if (cmd.contains(moveChar)){
            String destination = cmd.replace(moveChar, "").trim();
            requestService.move(destination);
        }
    }


    private static void loginInterceptor(String cmd){
        CharSequence loginChar = LOGIN;
        if (cmd.contains(loginChar)){
            String accountInfo = cmd.replace(loginChar, "").trim();
            userService.login(accountInfo);
        }
    }

    private static void registerInterceptor(String cmd){
        CharSequence registerChar = REGISTER;
        if (cmd.contains(registerChar)){
            String accoutnInfo = cmd.replace(registerChar, "").trim();
            userService.register(accoutnInfo);
        }
    }

}
