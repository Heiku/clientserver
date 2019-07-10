package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.TalkEntityProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

public class TalkEntityHandler extends SimpleChannelInboundHandler<TalkEntityProto.ResponseTalkEntity> {

    private static final String TALK_SPACE = "\t\t\t\t\t\t\t\t";
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, TalkEntityProto.ResponseTalkEntity responseTalkEntity) throws Exception {

        // 返回成功的话直接构造对话
        if (responseTalkEntity.getResult() == ResultCode.SUCCESS){
            String roleName = responseTalkEntity.getRole().getName();
            String npcName = responseTalkEntity.getEntity().getName();

            int first = responseTalkEntity.getFirst();
            String content = responseTalkEntity.getContent();

            // 解析content，生成对话信息
            StringBuilder sb = new StringBuilder();
            String[] conArr = content.split("\\|");
            if (first == 1) {
                for (int i = 0; i < conArr.length; i++){
                    if (i % 2 == 0){
                        sb.append(roleName + "：" + conArr[i] + "\n");
                    }else {
                        sb.append(TALK_SPACE + npcName + "：" + conArr[i] + "\n");
                    }
                }
            }else {
                for (int i = 0; i < conArr.length; i++){
                    if (i % 2 == 0){
                        sb.append(npcName + "：" + conArr[i] + "\n");
                    }else {
                        sb.append(TALK_SPACE + roleName + "：" + conArr[i] + "\n");
                    }
                }
            }

            System.out.println(sb.toString());
        }else {
            System.out.println(responseTalkEntity.getContent());
        }
    }


}
