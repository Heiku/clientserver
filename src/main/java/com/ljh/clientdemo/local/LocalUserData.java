package com.ljh.clientdemo.local;

public class LocalUserData {

    public static long USERID = 0l;

    public static void setUserId(long userId){
        USERID = userId;
    }

    public static long getUserId(){
        return USERID;
    }
}
