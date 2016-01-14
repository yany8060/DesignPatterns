package com.Visitor;

/**
 * Created by yanyong on 16/1/14.
 */

////另一个具体访问者角色
public class Bee implements Visitor {
    public void visit(Gladiolus g) {
        System.out.println("Bee and Gladiolus");
    }

    public void visit(Runuculus r) {
        System.out.println("Bee and Runuculus");
    }

    public void visit(Chrysanthemum c) {
        System.out.println("Bee and Chrysanthemum");
    }
}
