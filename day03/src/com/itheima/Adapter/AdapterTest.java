package com.itheima.Adapter;

public class AdapterTest {
    public static void main(String[] args) {

    }
}
interface Adapter{
    void play();
    void learn();
    void eat();
    void sleep();
}
 abstract class gotoAdapter implements Adapter{

    @Override
    public void play() {

    }

    @Override
    public void learn() {

    }

    @Override
    public void eat() {

    }

    @Override
    public void sleep() {

    }
}
class students extends gotoAdapter{

    @Override
    public void learn() {
        System.out.println("我只学习");
    }
}
