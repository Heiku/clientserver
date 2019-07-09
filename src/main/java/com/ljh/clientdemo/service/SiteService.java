package com.ljh.clientdemo.service;

import com.ljh.clientdemo.client.NettyClient;
import com.ljh.clientdemo.local.LocalUserData;
import com.ljh.clientdemo.proto.protoc.MsgSiteInfoProto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class SiteService {

    @Autowired
    private NettyClient nettyClient;

    /**
     * 获取当前的位置信息
     *
     * @return
     */
    public void getSite(){
        MsgSiteInfoProto.RequestSiteInfo requestSiteInfo = MsgSiteInfoProto.RequestSiteInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setType(MsgSiteInfoProto.RequestType.SITE)
                .setContent("client request site info")
                .build();

        nettyClient.sendMsg(requestSiteInfo);
    }



    /**
     * 移动到指定的目的地（场景）
     *
     * @param destination
     * @return
     */
    public void move(String destination){
        MsgSiteInfoProto.RequestSiteInfo requestSiteInfo = MsgSiteInfoProto.RequestSiteInfo.newBuilder()
                .setRequestId(UUID.randomUUID().toString())
                .setUserId(LocalUserData.USERID)
                .setType(MsgSiteInfoProto.RequestType.MOVE)
                .setContent(destination)
                .build();

        nettyClient.sendMsg(requestSiteInfo);
    }
}
