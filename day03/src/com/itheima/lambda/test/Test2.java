package com.itheima.lambda.test;

public class Test2 {
    public static void main(String[] args) {
           getTestTwo(new TestTwo() {
               @Override
               public void show(String s1) {
                   System.out.println("我是大魔王的老婆刘倩:"+s1);
               }
           });
        System.out.println("------------");
        getTestTwo( s1 -> System.out.println("我是lambda表达式，我只有一个参数，所以我可以省略参数类型，还有（），同时因为我只有一条语句，所以我也可以省略大括号{}还有一个;号"+s1));
    }
    public static void getTestTwo(TestTwo two){
        two.show("我是大魔王刘源");
    }
}

interface TestTwo{
    void show(String s1);
}
