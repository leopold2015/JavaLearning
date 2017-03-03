package com.object;

/**
 * Created by mgh on 2017/3/3.
 */
class Outer04{
    private String info = "hello,world!";
    class Inner{
        public void print(){
            System.out.println(info);
        }
    };
};
public class InnerClassDemo04 {
    public static void main(String args[]){
        Outer04 outer = new Outer04();
        Outer04.Inner in = outer.new Inner();
        in.print();
    }
}
