package com.singleton;

/**
 * Created by yanyong on 16/1/7.
 */
public class Singleton_hungry {
    //在自己内部定义自己一个实例
    //注意这是private 只供内部调用
    private static Singleton_hungry instance=new Singleton_hungry();
    //如上面所述，将构造函数设置为私有
    private Singleton_hungry(){

    }
    //静态工厂方法，提供了一个供外部访问得到对象的静态方法
    public static Singleton_hungry getInstance(){
        return instance;
    }
}
