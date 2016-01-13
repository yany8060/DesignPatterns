package com.Memento;

import java.util.Map;

/**
 * Created by yanyong on 16/1/13.
 */
public class Memento {
    private Map<String, Object> stateMap;

    public Memento(Map<String, Object> map){
        this.stateMap = map;
    }

    public Map<String, Object> getStateMap() {
        return stateMap;
    }

    public void setStateMap(Map<String, Object> stateMap) {
        this.stateMap = stateMap;
    }
}
