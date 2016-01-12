package com.Bridge;

/**
 * Created by yanyong on 16/1/11.
 */
abstract class Abstraction {
    // 持有一个 Implementor 对象，形成聚合关系
    protected Implementation implementation;

    public Abstraction(Implementation implementation) {
        this.implementation = implementation;
    }

    // 可能需要转调实现部分的具体实现
    public void operation() {
        implementation.operationImpl();
    }
}
