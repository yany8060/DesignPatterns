package com.Prototype;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanyong on 16/1/11.
 */
public class PrototypeManager {
    /**
     * 私有化构造方法，避免外部创建实例
     */
    private static PrototypeManager pm;
    /**
     * 用来记录原型的编号和原型实例的对应关系
     */
    private Map prototypes=null;

    private PrototypeManager(){
        prototypes=new HashMap();
    }

    //使用单例模式来得到原型管理器的唯一实例
    public static PrototypeManager getManager(){
        if(pm==null){
            pm=new PrototypeManager();
        }
        return pm;
    }

    /**
     *
     * @param name
     * @param prototype
     * 自定义新的产品对象时,同时向原型管理器注册一个原型对象
     * 而使用的类 只需要根据客户的需要来从原型管理器中得到一个对象就可以了
     */
    public static void register(String name,Object prototype){
        pm.prototypes.put(name,prototype);
    }

    public static synchronized void unregister(String name){
        pm.prototypes.remove(name);
    }

    public static Prototype getPrototype(String name){
        if(pm.prototypes.containsKey(name)){
            //将清单中对应原型的复制品返回给客户
            return ((Prototype)pm.prototypes.get(name)).clone();
        }else{
            Prototype object=null;
            try {
                object =(Prototype)Class.forName(name).newInstance();
                register(name , object);
            } catch(Exception e) {
                System.err.println("Class "+name+"没有定义!");
            }
            return object;
        }
    }

}
