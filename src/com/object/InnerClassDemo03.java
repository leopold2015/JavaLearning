package com.object;

/**
 * Created by mgh on 2017/3/3.
 */

class Outer03{
    private static String info = "hello,world!,I love you.";
    static class Inner{
        public void print(){
            System.out.println(info);
        }
    };
};
public class InnerClassDemo03 {

    public static void main(String args[]){
        new Outer03.Inner().print();
    }
}
