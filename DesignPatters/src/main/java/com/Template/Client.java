package com.Template;

/**
 * Created by yanyong on 16/1/13.
 */
public class Client {
    public static void main(String[] args) {
        //建立1个有'A'的CharDisplay的对象
        AbstractDisplay d1 = new CharDisplay('A');
        //建立1个有"Hello world"的StringDisplay的对象
        AbstractDisplay d2 = new StringDisplay("Hello World");

        //d1,d2都是AbstractDisplay的子类对象,可以调用继承到的display()方法
        d1.display();
        d2.display();
    }

}
