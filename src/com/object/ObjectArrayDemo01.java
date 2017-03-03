package com.object;

/**
 * Created by mgh on 2017/3/3.
 */
class Person{
    private String name;
    public Person(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }
}

public class ObjectArrayDemo01 {
    public static void main(String args[]){
        /*Person per[] = new Person[3];
        System.out.println("===========初始化===========");
        for(int x = 0;x<per.length;x++){
            System.out.println(per[x]+"/");
        }*/
        //静态初始化
        Person per[] = {new Person("zhangshan"),new Person("lisi"),new Person("wangwu")};

        //实例化对象数组
        /*per[0] = new Person("张三");
        per[1] = new Person("李四");
        per[2] = new Person("王五");*/

        System.out.println("============对象数组的打印============");
        for(int x=0;x<per.length;x++){
            System.out.println(per[x].getName()+"/");
        }
    }

}


