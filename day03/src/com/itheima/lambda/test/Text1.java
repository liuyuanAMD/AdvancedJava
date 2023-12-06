package com.itheima.lambda.test;

public class Text1 {
    public static void main(String[] args) {

        getTextOne(new TextOne() {
            @Override
            public void show() {
                System.out.println("匿名内部类");
            }
        });
        System.out.println("---------------");
        getTextOne(()->
            System.out.println("我是lambda表达式，我只有一行代码，所以可以省略大括号")
        );
    }
    public static void getTextOne(TextOne one){
        one.show();
    }
}


interface TextOne{
    void show();
}
