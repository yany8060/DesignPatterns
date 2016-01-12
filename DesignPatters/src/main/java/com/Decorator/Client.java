package com.Decorator;

/**
 * Created by yanyong on 16/1/12.
 */
public class Client {

    public static void main(String[] args){
        Project employe = new Employe();        //代码工人
        Project managerA = new ManagerA(employe); //项目经理
        Project managerB = new ManagerB(employe); //项目经理
//        Project managerB = new ManagerB(managerA); //项目经理
        //以经理的名义将编码完成，功劳都是经理的，实际编码的是工人
        managerA.doCoding();
        managerB.doCoding();
    }
}
