package com.ljh.clientdemo;

public class MainTest {
    public static void main(String[] args) {
        String cmd = "move 村庄";
        CharSequence c = "move";

        if (cmd.contains(c)){
            cmd = cmd.replace(c, "").trim();
            System.out.println(cmd);
        }

    }
}
