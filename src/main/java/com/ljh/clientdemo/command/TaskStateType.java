package com.ljh.clientdemo.command;

/**
 * @Author: Heiku
 * @Date: 2019/9/10
 */
public enum TaskStateType {

    UN_RECEIVE_TASK(1, "未领取任务"),
    RECEIVE_TASK(2, "已领取任务，但还未进行"),
    TASK_ALL_FINISH(3, "任务完成，已经领取"),
    TASK_FINISH(5, "任务完成，未领取奖励"),
    TASK_DISCARD(4, "放弃任务");


    int code;
    String content;

    TaskStateType(int _code, String _content){
        this.code = _code;
        this.content = _content;
    }


    public static String getContentFromCode(int code){
        for (TaskStateType v : TaskStateType.values()) {
            if (v.getCode() == code){
                return v.getContent();
            }
        }
        return null;
    }


    public int getCode() {
        return code;
    }

    public String getContent() {
        return content;
    }
}
