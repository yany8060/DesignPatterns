package com.Iterator;

/**
 * Created by yanyong on 16/1/13.
 */
public interface Collection {
    public Iterator iterator();
    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}
