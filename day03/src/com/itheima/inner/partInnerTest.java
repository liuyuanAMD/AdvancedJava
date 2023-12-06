package com.itheima.inner;

public class partInnerTest {
    public static void main(String[] args) {
      OTuer o=new OTuer();
      o.show();

    }
}
class OTuer{
    public void show(){
        class B {
            public void hide    () {
                System.out.println("我是一个处于局部内部类，我没有鸟用，别看我");
            }
        }
        B A=new B();
        A.hide();
    }
}