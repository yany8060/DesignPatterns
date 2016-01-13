package com.Observer;

/**
 * Created by yanyong on 16/1/13.
 */
public interface Observer {
    /**
     * 更新接口
     * @param state    更新的状态
     */
    public void update(String state);
}
