package com.Composite;

/**
 * Created by yanyong on 16/1/12.
 */

//Component : 组合中的对象声明接口，在适当的情况下， 实现所有类共有接口的默认行为。
// 声明一个接口用于访问和管理 Component 的子部件。

//抽象构件角色
abstract class Component {
    protected String name;
    public Component(String name){
        this.name=name;
    }

    public abstract void Add(Component c);
    public abstract void Remove(Component c);
    public abstract void Display(int depth);
}
