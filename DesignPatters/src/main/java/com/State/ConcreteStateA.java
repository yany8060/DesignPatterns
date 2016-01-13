package com.State;

/**
 * Created by yanyong on 16/1/13.
 */
public class ConcreteStateA implements State {
    public void handle(String sampleParameter) {

        System.out.println("ConcreteStateA handle ：" + sampleParameter);
    }
}
