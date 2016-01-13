package com.Template;

/**
 * Created by yanyong on 16/1/13.
 */
public class CharDisplay extends AbstractDisplay {
    private char ch;     //应输出的字符

    public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");   //输出"<<"作为开始字符串
    }

    @Override
    public void print() {
        System.out.print(ch);    //输出存储在字段的字符

    }

    @Override
    public void close() {
        System.out.println(">>");  //输出 ">>"作为结束字符串

    }
}
