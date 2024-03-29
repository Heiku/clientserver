package com.ljh.clientdemo.command;

public enum EntityType {
    Knight(100, "骑士"),
    Warrior(101, "战士"),
    Orc(102, "兽人"),
    Mage(103, "法师"),
    Priest(104, "牧师"),

    Guard(105, "守卫"),
    Thief(106, "盗贼"),
    Creeps(107, "野怪"),
    Robber(108, "强盗"),
    Beast(109, "野兽"),
    Devil(111, "恶魔"),
    HUMAN(112, "人类"),
    NONE(113, "虫子"),
    ELF(114, "精灵"),
    Villager(121, "村民"),
    Trader(116, "商人"),
    COMMON(200, "通用");

    int code;
    String content;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    EntityType(int code, String content){
        this.code = code;
        this.content = content;
    }

    public static EntityType getContentFromCode(int code){
        for (EntityType entityType : EntityType.values()){
            if (entityType.code == code){
                return entityType;
            }
        }
        return EntityType.NONE;
    }
}
