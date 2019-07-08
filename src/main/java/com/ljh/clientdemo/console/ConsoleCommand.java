package com.ljh.clientdemo.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * 用户控制台接口
 *
 */
public interface ConsoleCommand {

    void exec(Scanner scanner, Channel channel);
}
