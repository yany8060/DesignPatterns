package com.Flyweight.CompositeFlyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanyong on 16/1/12.
 */
public class ConcreteCompositeFlyweight implements Flyweight {

    //分解成为多个单纯享元对象的组合。
    private Map<Character,Flyweight> files = new HashMap<Character,Flyweight>();
    /**
     * 增加一个新的单纯享元对象到聚集中
     */
    public void add(Character key , Flyweight fly){
        files.put(key,fly);
    }
    /**
     * 外蕴状态作为参数传入到方法中
     */
    public void operation(String state) {
        Flyweight fly = null;
        for(Object o : files.keySet()){
            fly = files.get(o);
            fly.operation(state);
        }
    }
}
