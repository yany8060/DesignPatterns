package com.Visitor;

/**
 * Created by yanyong on 16/1/14.
 */

//元素角色
public interface Flower {
    void accept(Visitor v);
}
