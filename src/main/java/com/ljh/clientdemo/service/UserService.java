package com.ljh.clientdemo.service;

import com.google.common.base.Strings;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.proto.protoc.MsgUserInfoProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserService {

    @Autowired
    private NettyClient nettyClient;

    /**
     * 获取当前用户的状态
     */
    public void getUserState(){
        long userId = LocalUserData.USERID;
        if (userId <= 0){
            System.out.println("当前用户尚未登录服务器，请进行登录操作!\n 具体登录指令：login 账号,密码");
            return;
        }

        MsgUserInfoProto.RequestUserInfo requestUserInfo = MsgUserInfoProto.RequestUserInfo.newBuilder()
                .setType(MsgUserInfoProto.RequestType.STATE)
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(userId)
                .build();

        nettyClient.sendMsg(requestUserInfo);
    }


    /**
     * 发送登录请求
     *
     * @param accountInfo
     */
    public void login(String accountInfo){
        if (Strings.isNullOrEmpty(accountInfo)){
            System.out.println("尚未输入账号信息，请重新发送 login 指令");
            return;
        }
        // 解析输入的字符串，分割为两个参数
        String[] strArr = accountInfo.split(",");
        String username = strArr[0];
        String password = strArr[1];

        MsgUserInfoProto.RequestUserInfo requestUserInfo = MsgUserInfoProto.RequestUserInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setType(MsgUserInfoProto.RequestType.LOGIN)
                .setUsername(username)
                .setPassword(password)
                .build();

        nettyClient.sendMsg(requestUserInfo);

    }

    /**
     * 发送注册请求
     *
     * @param accountInfo
     */
    public void register(String accountInfo){
        if (Strings.isNullOrEmpty(accountInfo)){
            System.out.println("尚未输入账号信息，请重新发送 register 指令");
            return;
        }

        // 解析输入的字符串，分割为两个参数
        String[] strArr = accountInfo.split(",");
        String username = strArr[0];
        String password = strArr[1];

        MsgUserInfoProto.RequestUserInfo requestUserInfo = MsgUserInfoProto.RequestUserInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setType(MsgUserInfoProto.RequestType.REGISTER)
                .setUsername(username)
                .setPassword(password)
                .build();

        nettyClient.sendMsg(requestUserInfo);
    }

    /**
     * 发送退出系统exit指令
     */
    public void exit(){
        long userId = LocalUserData.USERID;
        if (userId <= 0){
            System.out.println("当前用户尚未登录服务器，请进行登录操作!\n 具体登录指令：login 账号,密码");
            return;
        }

        MsgUserInfoProto.RequestUserInfo requestUserInfo = MsgUserInfoProto.RequestUserInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(userId)
                .setType(MsgUserInfoProto.RequestType.EXIT)
                .build();

        nettyClient.sendMsg(requestUserInfo);
    }

}
