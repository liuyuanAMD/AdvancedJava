package com.itheima.inner;

public class Innertest {
    public static void main(String[] args) {
        Outer.inner print=new Outer().new inner();
        print.show();


    }
}
class Outer{
    int num=100;
    void showe()  {
        System.out.println(num);
    }
    class inner{
        int num=200;

         void show(){
             int num=10;
             System.out.println(num);
             System.out.println(this.num);
             System.out.println(Outer.this.num);
             showe();
         }

    }


}
