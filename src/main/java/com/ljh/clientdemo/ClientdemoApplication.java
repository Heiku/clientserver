package com.ljh.clientdemo;

import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.service.EntityService;
import com.ljh.clientdemo.service.RequestService;
import com.ljh.clientdemo.service.SiteService;
import com.ljh.clientdemo.service.UserService;
import com.ljh.clientdemo.utils.SpringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

import static com.ljh.clientdemo.command.CommandType.*;

@SpringBootApplication
public class ClientdemoApplication {

    @Autowired
    private static RequestService requestService;

    @Autowired
    private static SiteService siteService;

    @Autowired
    private static UserService userService;

    @Autowired
    private static EntityService entityService;


    @Autowired
    public ClientdemoApplication(RequestService requestService, UserService userService, EntityService entityService,
                                 SiteService siteService){
        ClientdemoApplication.requestService = requestService;
        ClientdemoApplication.userService = userService;
        ClientdemoApplication.entityService = entityService;
        ClientdemoApplication.siteService = siteService;
    }
/*
    static {
        requestService = SpringUtil.getBean(RequestService.class);
        siteService = SpringUtil.getBean(SiteService.class);
        userService = SpringUtil.getBean(UserService.class);
        entityService = SpringUtil.getBean(EntityService.class);
    }*/

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
                    siteService.getSite();
                    break;
                case DATE:
                    requestService.getDate();
                    break;
                case AOI:
                    entityService.getAOI();
                    break;
                case STATE:
                    userService.getUserState();
                    break;
                case EXIT:
                    userService.exit();
                    break;
                case UID:
                    System.out.println(LocalUserData.USERID);
                    break;
            }
        }
    }

    private static void moveInterceptor(String cmd) {
        CharSequence moveChar = MOVE;
        if (cmd.contains(moveChar)){
            String destination = cmd.replace(moveChar, "").trim();
            siteService.move(destination);
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
            String accountInfo = cmd.replace(registerChar, "").trim();
            userService.register(accountInfo);
        }
    }

}
