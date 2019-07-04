package com.ljh.clientdemo.service;

import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.proto.MessageBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RequestService {

    @Autowired
    private NettyClient nettyClient;

    /**
     * 获取当前的位置信息
     *
     * @return
     */
    public String getSite(){
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setCmd(MessageBase.Message.CommandType.SITE)
                .setContent("client request site info")
                .build();

        nettyClient.sendMsg(msg);
        return "Send client request site info";
    }


    /**
     * 获取当前的游戏时间
     *
     * @return
     */
    public String getDate(){
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setCmd(MessageBase.Message.CommandType.DATE)
                .setContent("client request date info")
                .build();

        nettyClient.sendMsg(msg);
        return "Send client request date info";
    }


    /**
     * 移动到指定的目的地（场景）
     *
     * @param destination
     * @return
     */
    public String move(String destination){
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setCmd(MessageBase.Message.CommandType.MOVE)
                .setContent(destination)
                .build();

        nettyClient.sendMsg(msg);
        return "Send Client request move ";
    }


    /**
     * 获取当前场景中的所有npc实体
     */
    public void getAOI() {
        // 加入用户ID作为标识符
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setCmd(MessageBase.Message.CommandType.AOI)
                .setUserId(LocalUserData.USERID)
                .build();

        nettyClient.sendMsg(msg);
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

        MessageBase.Message message = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(userId)
                .setCmd(MessageBase.Message.CommandType.EXIT)
                .build();

        nettyClient.sendMsg(message);
    }
}
