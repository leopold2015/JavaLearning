package com.object;

/**
 * Created by mgh on 2017/3/3.
 */

class Outer01{
    private String info = "hello,world!";
    class Inner{
        public void print(){
            System.out.println(info);
        }
    };
    public void fun(){
        new Inner().print();
    }
}
public class InnerClassDemo01 {
    public static void main(String args[]){
        new Outer01().fun();
    }
}
