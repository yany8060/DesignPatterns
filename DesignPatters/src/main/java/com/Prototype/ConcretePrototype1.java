package com.Prototype;

/**
 * Created by yanyong on 16/1/11.
 */
public class ConcretePrototype1 implements Prototype{
    private String name;

    public Prototype clone(){
        //最简单的克隆，新建一个自身对象，由于没有属性就不再复制值了
        Prototype prototype = new ConcretePrototype1();
        prototype.setName(this.name);
        return prototype;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
