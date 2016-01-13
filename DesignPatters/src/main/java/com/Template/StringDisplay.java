package com.Template;

/**
 * Created by yanyong on 16/1/13.
 */
public class StringDisplay extends AbstractDisplay {
    private String string;  //应输出的字符串
    private int width;      //以byte为单位所求出的字符串的"长度"

    public StringDisplay(String string) {
        this.string =string;
        width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|"+string+"|");
    }

    @Override
    public void close() {
        printLine();
    }

    public void printLine() {
        System.out.print("+");  //输出"+"号表示边框位置
        for(int i=0; i < width; ++i) {
            System.out.print("-");  //当作线段
        }
        System.out.println("+");  //输出"+"号表示边框位置
    }
}
