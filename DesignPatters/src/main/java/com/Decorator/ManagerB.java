package com.Decorator;

/**
 * Created by yanyong on 16/1/12.
 */
public class ManagerB extends Manager {
    public ManagerB(Project project) {
        super(project);
    }

    @Override
    void doEarlyWork() {
        System.out.println("项目经理B 在做需求分析");
        System.out.println("项目经理B 在做详细设计");
    }

    @Override
    void doEndWork() {
        System.out.println("项目经理B 在做收尾工作");
    }
}
