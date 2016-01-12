package com.Bridge;

/**
 * Created by yanyong on 16/1/11.
 */
public class RefinedAbstraction extends Abstraction{
    public RefinedAbstraction(Implementation implementation) {
        super(implementation);
    }

    public void otherOperation() {
        // 实现一定的功能，可能会使用具体实现部分的实现方法,
        // 但是本方法更大的可能是使用 Abstraction 中定义的方法，
        // 通过组合使用 Abstraction 中定义的方法来完成更多的功能。
        System.out.println("其他操作");
    }
}
