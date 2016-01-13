package com.Command;

/**
 * Created by yanyong on 16/1/12.
 */

//请求者角色类
public class Invoker {
    /**
     * 持有命令对象
     */
    public Command command;

    public Invoker(Command command){
        this.command=command;
    }
    /**
     * 行动方法 调用命令对象执行在这个请求
     */
    public void action(){
        command.execute();
    }
}
