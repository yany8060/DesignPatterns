package com.Strategy;

/**
 * Created by yanyong on 16/1/13.
 */
public class Client {
    public static void main(String[] args) {
        //选择并创建需要使用的策略对象
        ConcreteStrategyA cA=new ConcreteStrategyA();
        //创建环境
        Context context=new Context(cA);
        //业务逻辑
        context.contextInterface();
    }
}
