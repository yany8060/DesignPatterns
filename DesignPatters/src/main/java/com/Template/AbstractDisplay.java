package com.Template;

/**
 * Created by yanyong on 16/1/13.
 */

/**
 * 抽象类,充当模板角色*
 */
public abstract class AbstractDisplay {
    //由子类实现的抽象方法
    public abstract void open();
    public abstract void print();
    public abstract void close();


    //抽象类实现的方法,final可以保证在子类不会被修改
//    、、算法的不变的部分
    public final void display() {
        open();   //先open...
        for(int i=0; i < 5; i++) {  //反复输出5次
            print();
        }
        close(); //输出完毕,close
    }
}
