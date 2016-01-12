package com.Decorator;

/**
 * Created by yanyong on 16/1/12.
 */

//具体构件角色（Concrete Component）：这是被装饰者，定义一个将要被装饰增加功能的类
public class Employe implements Project {
    /**
     * 编码
     */
    public void doCoding() {
        System.out.println("代码工人 在编写代码，加班编啊编啊，终于编完了！");
    }
}
