package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.proto.protoc.MsgPKProto;
import com.ljh.clientdemo.proto.protoc.PKProto;
import com.ljh.clientdemo.proto.protoc.RoleProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

/**
 * 处理玩家的pk请求结果
 *
 * @Author: Heiku
 * @Date: 2019/8/13
 */

public class PKHandler extends SimpleChannelInboundHandler<MsgPKProto.ResponsePK> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgPKProto.ResponsePK resp) throws Exception {
        if (resp.getResult() != ResultCode.SUCCESS){
            System.out.println(resp.getContent() + "\n");
        }

        StringBuilder sb = new StringBuilder();
        if (resp.getType().equals(MsgPKProto.RequestType.AC)){
            System.out.println(resp.getContent());
        }

        else if (resp.getType().equals(MsgPKProto.RequestType.RESULT)){
            System.out.println(resp.getContent());

            PKProto.PKRecord record = resp.getRecord();
            RoleProto.Role winner = record.getWinner();
            RoleProto.Role loser = record.getLoser();

            sb.append("获胜者：" + winner.getName() + " 奖励荣誉值：" + record.getWinHonor() + " 总荣誉值：" + winner.getHonor() + "\n\n");
            sb.append("战败方：" + loser.getName() + " 奖励荣誉值：" + record.getLoseHonor() + " 总荣誉值：" + loser.getHonor() + "\n\n");

            System.out.println(sb.toString());
        }
    }
}
