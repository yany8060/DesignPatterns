package com.singleton;

/**
 * Created by yanyong on 16/1/7.
 */
public class Singleton_lazy {

    private static Singleton_lazy instance=null;
    private Singleton_lazy(){}
    public static synchronized Singleton_lazy getInstance(){
        if(instance==null)
            instance=new Singleton_lazy();
        return instance;
    }
}
