package com.Adapter.ClassAdapter;

/**
 * Created by yanyong on 16/1/11.
 */
public interface Target {
    /**
     * 这是源类Adaptee也有的方法
     */
    public void sampleOperation1();
    /**
     * 这是源类Adapteee没有的方法
     */
    public void sampleOperation2();
}
