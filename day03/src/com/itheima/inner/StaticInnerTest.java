package com.itheima.inner;

public class StaticInnerTest {
    public static void main(String[] args) {
        OuterClass.StaticInner.hide();
    }
}
class OuterClass{
    int num=10;
    static int num2=20;


   static class StaticInner{
        void show() {
            System.out.println("这是一个静态内部类");
        }
        public static void hide(){
            System.out.println("我是静态内部类中的一个静态方法");
            System.out.println(num2);


        }
    }
}
