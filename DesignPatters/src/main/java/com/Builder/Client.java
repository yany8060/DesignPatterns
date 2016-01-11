package com.Builder;

/**
 * Created by yanyong on 16/1/11.
 */
public class Client {
    public static void main(String[]args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();
        product _product = builder.retrieveResult();
        System.out.println(_product.getPart1());
        System.out.println(_product.getPart2());
    }
}
