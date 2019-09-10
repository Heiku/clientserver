package com.ljh.clientdemo.client.handler;

import com.ljh.clientdemo.command.ResultCode;
import com.ljh.clientdemo.command.TaskStateType;
import com.ljh.clientdemo.proto.protoc.GoodsProto;
import com.ljh.clientdemo.proto.protoc.MsgTaskProto;
import com.ljh.clientdemo.proto.protoc.TaskProto;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import org.springframework.util.CollectionUtils;

import java.util.List;

/**
 * @Author: Heiku
 * @Date: 2019/9/10
 */
public class TaskHandler extends SimpleChannelInboundHandler<MsgTaskProto.ResponseTask> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MsgTaskProto.ResponseTask resp) throws Exception {
        int result = resp.getResult();
        if (result != ResultCode.SUCCESS){
            System.out.println(resp.getContent());
            return;
        }

        StringBuilder sb = new StringBuilder();
        int type = resp.getTypeValue();
        if (type == MsgTaskProto.RequestType.TASK_ALL_VALUE){
            List<TaskProto.Task> tasks = resp.getTaskList();

            sb.append(resp.getContent());

            tasks.forEach(t -> {
                List<GoodsProto.Goods> goods = t.getGoodsList();
                StringBuilder s = new StringBuilder("[");
                goods.forEach(g -> {
                    String name = "";
                    if (g.getEquip() == null || g.getEquip().getName().equals("")){
                        name = g.getItem().getName();
                    }else {
                        name = g.getEquip().getName();
                    }
                    s.append(name + " ， ");
                });

                s.append("]");
                sb.append("taskId: " + t.getTaskId() + " 任务名：" + t.getName() + " 描述：" + t.getDesc() + " 金币奖励：" +
                        t.getGold() + " 装备奖励：" + s.toString() + "\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgTaskProto.RequestType.TASK_STATE_VALUE){
            List<TaskProto.Task> tasks = resp.getTaskList();
            if (CollectionUtils.isEmpty(tasks)){
                System.out.println("暂无任务信息！\n\n");
                return;
            }

            sb.append(resp.getContent());
            tasks.forEach(t -> {
                sb.append("id: " + t.getId() + " taskId: " + t.getTaskId() + " 任务名称: " + t.getName() +
                        " 描述：" + t.getDesc() + " 状态：" + TaskStateType.getContentFromCode(t.getState()) + "\n");
            });

            System.out.println(sb.toString());
        }

        else if (type == MsgTaskProto.RequestType.TASK_COMMON_VALUE){
            System.out.println(resp.getContent());
        }
    }
}
