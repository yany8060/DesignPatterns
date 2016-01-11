package com.Builder;

/**
 * Created by yanyong on 16/1/11.
 */
//抽象建造者类Builder
public interface Builder {
    public void buildPart1();
    public void buildPart2();
    public product retrieveResult();
}
