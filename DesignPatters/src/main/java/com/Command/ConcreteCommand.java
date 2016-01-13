package com.Command;

/**
 * Created by yanyong on 16/1/12.
 */
public class ConcreteCommand implements Command {
    //持有相应地接收者
    private Receiver receiver;

    public ConcreteCommand(Receiver receiver){
        this.receiver=receiver;
    }

    public void execute() {
        //通常会转调接收者对象的相应方法，让接收者来真正执行功能
        receiver.action();
    }
}
