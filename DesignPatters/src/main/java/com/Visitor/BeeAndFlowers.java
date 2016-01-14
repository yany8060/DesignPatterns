package com.Visitor;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by yanyong on 16/1/14.
 */
public class BeeAndFlowers  {
    /*
    在这里你能看到访问者模式执行的流程: 首先在客户端先获得一个具体的访问者角色 遍历对象结构
    对每一个元素调用 accept 方法,将具体访问者角色传入 这样就完成了整个过程
    */ //对象结构角色在这里才组装上
    List flowers = new ArrayList();
    public BeeAndFlowers() {
        for(int i = 0; i < 10; i++)
            flowers.add(FlowerGenerator.newFlower());
    }
    Visitor sval ;
    public void test() {
        // It's almost as if I had a function to
        // produce a Flower string representation:
        // 这个地方你可以修改以便使用另外一个具体访问者角色
        sval = new StringVal();
        Iterator it = flowers.iterator();
        while (it.hasNext()) {
            ((Flower) it.next()).accept(sval);
            System.out.println(sval);
        }
    }
        public static void main(String args[]) {
            BeeAndFlowers beeAndFlowers=new BeeAndFlowers();
            beeAndFlowers.test();
    }
}
