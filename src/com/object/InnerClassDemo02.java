package com.object;

/**
 * Created by mgh on 2017/3/3.
 */
class Outer02{
    private String info = "hello,world!";
    String getInfo(){
        return this.info;
    }
    public void fun(){
        new Inner(this).print();
    }
};

class Inner{
    private Outer02 outer = null;
    public Inner(Outer02 outer){
        this.outer = outer;
    }
    public void print(){
        System.out.println(outer.getInfo());
    }
};
public class InnerClassDemo02 {
    public static void main(String args[]){
        new Outer02().fun();
    }
}
