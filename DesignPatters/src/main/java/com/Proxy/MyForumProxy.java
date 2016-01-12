package com.Proxy;

/**
 * Created by yanyong on 16/1/12.
 */
public class MyForumProxy implements MyForum {

    private RealMyForum forum = new RealMyForum() ;
    private int permission ; //权限值
    public MyForumProxy(int permission) {
        this.permission = permission ;
    }

    //实现的接口
    public void AddFile() {
    //Constants 是一个常量类
    if(Constants.ASSOCIATOR == permission) {
        forum.AddFile();
    }
    else
        System.out.println("You are not a associator of MyForum ,please registe!");
    }
}
