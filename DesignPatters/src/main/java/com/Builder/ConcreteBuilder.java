package com.Builder;

/**
 * Created by yanyong on 16/1/11.
 */
//具体建造者类ConcreteBuilder
public class ConcreteBuilder implements Builder{
    private product _product = new product();
    /**
     * 产品零件建造方法1
     */
    public void buildPart1() {
        //构建产品的第一个零件
        _product.setPart1("编号：9527");
    }
    /**
     * 产品零件建造方法2
     */
    public void buildPart2() {
        //构建产品的第二个零件
        _product.setPart2("名称：XXX");
    }
    /**
     * 产品返还方法
     */
    public product retrieveResult() {
        return _product;
    }
}
