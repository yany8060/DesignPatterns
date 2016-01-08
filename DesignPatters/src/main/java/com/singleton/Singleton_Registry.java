package com.singleton;

import java.util.HashMap;

/**
 * Created by yanyong on 16/1/8.
 */
public class Singleton_Registry {
    //用来存放对应关系
    private static HashMap sinRegistry=new HashMap();
    static private Singleton_Registry s=new Singleton_Registry();
    //受保护的构造函数
    protected Singleton_Registry(){}
    public static Singleton_Registry getInstances(String name){
        if(name==null){
            name="Singleton_Registry";
        }
        if(sinRegistry.get(name)==null){
            try {
                sinRegistry.put(name,Class.forName(name).newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return (Singleton_Registry)(sinRegistry.get(name));
    }

    public void test(){
        System.out.println("get calss success");
    }
}

class SingletonChild1 extends Singleton_Registry{
    public SingletonChild1(){}
    static public SingletonChild1 getInstance(){
        return (SingletonChild1)Singleton_Registry.getInstances("SingletonChild1");
    }
    public void test(){
        System.out.println("get class success111");
    }
}
