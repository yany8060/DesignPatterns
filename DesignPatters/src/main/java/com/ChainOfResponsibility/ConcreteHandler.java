package com.ChainOfResponsibility;

/**
 * Created by yanyong on 16/1/12.
 */
public class ConcreteHandler extends Handler {

    /**
     * 处理方法，调用此方法处理请求
     */
    @Override
    public void handleRequest() {
        /**
         * 判断是否有后继的责任对象
         * 如果有，就转发请求给后继的责任对象
         * 如果没有，则处理请求
         */
        if(getSuccessor() != null) {
            System.out.println("放过请求");
            //添加各个条件
            //如果条件不符传递给下一个对象处理
            getSuccessor().handleRequest();
        }else {
            System.out.println("处理请求");
        }
    }
}
