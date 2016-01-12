package com.Flyweight.SingleFlyweight;

/**
 * Created by yanyong on 16/1/12.
 */
public class Client {

//    虽然客户端申请了三个享元对象，但是实际创建的享元对象只有两个，这就是共享的含义。
    public static void main(String[] args) {
        FlyweightFactory factory = new FlyweightFactory();
        Flyweight fly = factory.factory(new Character('a'));
        fly.operation("First Call");

        fly = factory.factory(new Character('b'));
        fly.operation("Second Call");

        //选取共享的对象
        fly = factory.factory(new Character('a'));
        fly.operation("Third Call");
    }
}
