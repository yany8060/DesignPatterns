package com.Composite;

/**
 * Created by yanyong on 16/1/12.
 */
public class Leaf extends Component {

    public Leaf(String name) {
        super(name);
    }

    //对于第 一种方式中叶子节点内不需要的方法可以使用空处理或者异常报告的方式来解决
    @Override
    public void Add(Component c) {
        System.out.println("Can not add to a leaf");
    }

    //对于第 一种方式中叶子节点内不需要的方法可以使用空处理或者异常报告的方式来解决
    @Override
    public void Remove(Component c) {
        System.out.println("Can not remove from a leaf");
    }

    @Override
    public void Display(int depth) {
        String temp = "";
        for (int i = 0; i < depth; i++)
            temp += '-';
        System.out.println(temp + name);
    }
}
