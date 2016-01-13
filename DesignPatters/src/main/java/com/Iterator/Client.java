package com.Iterator;

/**
 * Created by yanyong on 16/1/13.
 */
public class Client {

    public static void main(String[] args) {
        Collection collection = new MyCollection();
        Iterator it = collection.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
