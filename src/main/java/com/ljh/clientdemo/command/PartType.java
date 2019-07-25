package com.ljh.clientdemo.command;

/**
 * @Author: Heiku
 * @Date: 2019/7/25
 */
public enum  PartType {

    HELMET(1, "头盔"),
    NECKLACE(3, "项链"),
    ARMOR(4, "护甲"),
    LEGGINGS(7, "护腿"),
    ARMS(10, "武器");


    private int code;
    private String content;

    PartType(int code, String content){
        this.code = code;
        this.content = content;
    }


    public static String getContentByCode(int code){
        for (PartType value : PartType.values()) {
            if (value.getCode() == code){
                return value.getContent();
            }
        }

        return null;
    }

    public String getContent() {
        return content;
    }

    public int getCode() {
        return code;
    }
}
