package com.Memento;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yanyong on 16/1/13.
 */
public class Caretaker {
    private Map<String, Memento> memMap = new HashMap<String, Memento>();
    public Memento getMemento(String index){
        return memMap.get(index);
    }

    public void setMemento(String index, Memento memento){
        this.memMap.put(index, memento);
    }

}
