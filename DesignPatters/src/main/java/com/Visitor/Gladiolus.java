package com.Visitor;

/**
 * Created by yanyong on 16/1/14.
 */
public class Gladiolus implements Flower {
    public void accept(Visitor v) {
        v.visit(this);
    }
}
