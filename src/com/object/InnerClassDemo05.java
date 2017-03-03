package com.object;

/**
 * Created by mgh on 2017/3/3.
 */
class Outer05{
    private String info = "hello,world!";
    public void fun(final int temp){
        class Inner{
            public void print(){
                System.out.println("类中的属性："+info);
                System.out.println("方法中的参数："+temp);
            }
        };
        new Inner().print();
    }
};
public class InnerClassDemo05 {
    public static void main(String args[]){
        new Outer05().fun(30);
    }
}
