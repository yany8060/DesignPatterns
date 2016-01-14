package com.Visitor;

/**
 * Created by yanyong on 16/1/14.
 */
public interface Visitor {
    void visit(Gladiolus g);
    void visit(Runuculus r);
    void visit(Chrysanthemum c);
}
