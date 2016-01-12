package com.Adapter.ObjectAdapter;

/**
 * Created by yanyong on 16/1/11.
 */
public class Adapter  implements Target{
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee){
        //两种初始化方法
//        this.adaptee = adaptee;
        adaptee=new Adaptee();

    }
    /**
     * 源类Adaptee有方法sampleOperation1
     * 因此适配器类直接委派即可
     */
    public void sampleOperation1(){
        this.adaptee.sampleOperation1();
    }
    /**
     * 源类Adaptee没有方法sampleOperation2
     * 因此由适配器类需要补充此方法
     */
    public void sampleOperation2(){
        //写相关的代码
    }
}
