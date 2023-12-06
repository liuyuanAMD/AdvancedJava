package com.itheima.AnonClassText;

public class AnonymousInnerclasses {
    public static void main(String[] args) {


        show(new Inter() {
            @Override
            public void show() {
                System.out.println("我是一个匿名内部类我的作用是在一个方法里面要的参数是接口时我可以作用");
            }
        });
    }



        public static void show(Inter i){
        i.show();

        }

}
interface  Inter{
    void show();
}
