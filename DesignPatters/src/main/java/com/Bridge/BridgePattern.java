package com.Bridge;

/**
 * Created by yanyong on 16/1/11.
 */
public class BridgePattern {
    public static void main(String[] args){
        Implementation implementation=new ConcreteImplementorB();
        RefinedAbstraction abstraction=new RefinedAbstraction(implementation);
        abstraction.operation();
        abstraction.otherOperation();
    }
}
