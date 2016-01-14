package com.Visitor;

/**
 * Created by yanyong on 16/1/14.
 */

//实现的具体访问者角色
public class StringVal implements Visitor {

    String s;
    public String toString() {
        return s;
    }

    public void visit(Gladiolus g) {
        s = "Gladiolus";
    }

    public void visit(Runuculus r) {
        s = "Runuculus";
    }

    public void visit(Chrysanthemum c) {
        s = "Chrysanthemum";
    }
}
