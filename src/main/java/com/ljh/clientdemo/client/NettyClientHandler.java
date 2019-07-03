package com.ljh.clientdemo.client;

import com.ljh.clientdemo.command.CommandType;
import com.ljh.clientdemo.common.EntityType;
import com.ljh.clientdemo.proto.MessageBase;
import com.ljh.clientdemo.utils.IOUtils;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import lombok.extern.slf4j.Slf4j;


@Slf4j
public class NettyClientHandler extends SimpleChannelInboundHandler<MessageBase.Message> {

    /**
     * 客户端接受信息
     *
     * @param ctx
     * @param message
     * @throws Exception
     */
    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageBase.Message message) throws Exception {
        //log.info("客户端收到消息：{}", message.toString());
        System.out.println(message.getContent());

        if (message.getCmd().equals(MessageBase.Message.CommandType.REGISTER) ||
            message.getCmd().equals(MessageBase.Message.CommandType.LOGIN)){
            MessageBase.UserInfo userInfo = message.getUserList().get(0);

            // 获取token，写回到文件中
            String token = userInfo.getToken();
            IOUtils.writeToken(token);

            // 存放当前用户的userId
            LocalUserData.USERID = message.getUserId();

            System.out.println("更新token文件成功");
        }else if (message.getCmd().equals(MessageBase.Message.CommandType.USER_STATE)){
            MessageBase.Role role = message.getRoleList().get(0);

            String typeName = EntityType.getContentFromCode(role.getType()).getContent();
            String aliveName = role.getAlive() == 1 ? "存活" : "死亡";

            System.out.println("当前的角色为：" + role.getName() + " 职业：" + typeName + " 等级：" + role.getLevel() +
                    " 状态：" + aliveName + "\n");

        }else if (message.getCmd().equals(MessageBase.Message.CommandType.EXIT)){

            // 退出系统成功，删除本地记录
            IOUtils.writeToken("");

            LocalUserData.USERID = 0;
        }
    }


    /**
     * 处理异常，一般将异常处理逻辑的Handler放在ChannelPipeline的最后
     * 确保入站的消息总是能被处理
     *
     * @param ctx
     * @param cause
     * @throws Exception
     */
    @Override
    public void exceptionCaught(ChannelHandlerContext ctx, Throwable cause) throws Exception {
        cause.printStackTrace();
        ctx.close();
    }


    /**
     * 建立连接立刻向服务端发送 获取用户请求，判断当前用户是否登录
     *
     * @param ctx
     * @throws Exception
     */
    /*@Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        MessageBase.Message msg = MessageBase.Message.newBuilder()
                .setCmd(MessageBase.Message.CommandType.USER_STATE)
                .setRequestId(UUID.randomUUID().toString())
                .setContent("")
                .build();

        ctx.writeAndFlush(msg);
    }*/
}
