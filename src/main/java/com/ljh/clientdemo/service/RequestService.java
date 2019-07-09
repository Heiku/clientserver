package com.ljh.clientdemo.service;

import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.proto.protoc.MessageBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class RequestService {

    @Autowired
    private NettyClient nettyClient;

    /**
     * 获取当前的游戏时间
     *
     * @return
     */
    public void getDate(){
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setType(MessageBase.RequestType.DATE)
                .setContent("client request date info")
                .build();

        nettyClient.sendMsg(msg);
    }
}
