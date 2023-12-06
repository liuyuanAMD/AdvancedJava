package com.itheima.lambda;

public class LambdaDemo1 {
    public static void main(String[] args) {
        useInterA(()->{
            System.out.println("我是一个lambda表达式，感谢你今天可以 认识我");
        });
    }
    public static void useInterA(InterA a){
        a.show();

    }
}
interface InterA{
    void show();
}
