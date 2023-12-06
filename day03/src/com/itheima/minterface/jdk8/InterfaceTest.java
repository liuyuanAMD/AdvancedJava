package com.itheima.minterface.jdk8;

public class InterfaceTest {
    public static void main(String[] args) {
           AIntermpl a=new AIntermpl();
           a.method();
           A.mm();
    }


}
interface  A{
    default void method(){
        System.out.println("我是你爹");
    }
    static void mm(){
        System.out.println("mm我非常的饿");
    }
}
interface Inter{
    void show();
    void print();
    public default  void method(){
        System.out.println("mm我有一点饿");
    }
}
class AIntermpl  implements  Inter ,A{


    @Override
    public void show() {
        System.out.println("跳舞");
    }

    @Override
    public void print() {
        System.out.println("你TM的真的是一个傻逼扣我分");
    }

    @Override
    public void method() {
        A.super.method();
        Inter.super.method();
    }
}

class BIntermpl implements Inter{

    @Override
    public void show() {
        System.out.println("给我跪下");
    }

    @Override
    public void print() {
        System.out.println("打印你全家的名字");
    }
}
