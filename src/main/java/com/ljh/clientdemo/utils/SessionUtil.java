package com.ljh.clientdemo.utils;

import com.ljh.clientdemo.attribute.Attributes;
import io.netty.channel.Channel;

public class SessionUtil {

    public static void bindSession(Long userId, Channel channel){

        channel.attr(Attributes.USER_ID).set(userId);
    }

}
