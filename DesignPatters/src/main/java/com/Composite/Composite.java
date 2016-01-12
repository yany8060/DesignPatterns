package com.Composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yanyong on 16/1/12.
 */
public class Composite extends Component{
    private List<Component> children = new ArrayList<Component>();

    public Composite(String name) {
        super(name);
    }

    //叶子节点和树枝节点都可以被加进来
    @Override
    public void Add(Component c) {
        children.add(c);

    }

    @Override
    public void Remove(Component c) {
        children.remove(c);
    }

    //这个方法里面就是递归的调用了,至于你的 Component 到底是什么类型的只有在运行的时候得知
    @Override
    public void Display(int depth) {
        String temp="";
        for(int i=0;i<depth;i++){
            temp+="-";
        }
        System.out.println(depth);
        for (Component c:children){
            c.Display(depth+2);
        }

    }
}
