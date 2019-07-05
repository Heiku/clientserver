package com.ljh.clientdemo.service;

import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.MsgEntityInfoProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class EntityService {

    @Autowired
    private NettyClient nettyClient;

    /**
     * 获取当前场景中的所有npc实体
     */
    public void getAOI() {
        // 加入用户ID作为标识符
        MsgEntityInfoProto.RequestEntityInfo requestEntityInfo = MsgEntityInfoProto.RequestEntityInfo.newBuilder()
                .setType(MsgEntityInfoProto.RequestType.AOI)
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .build();

        nettyClient.sendMsg(requestEntityInfo);
    }
}
