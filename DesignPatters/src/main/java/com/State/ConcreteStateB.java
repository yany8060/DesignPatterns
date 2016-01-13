package com.State;

/**
 * Created by yanyong on 16/1/13.
 */
public class ConcreteStateB implements State {
    public void handle(String sampleParameter) {
        System.out.println("ConcreteStateB handle ：" + sampleParameter);
    }
}
