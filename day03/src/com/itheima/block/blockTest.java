package com.itheima.block;

public class blockTest {
    public static void main(String[] args) {
        {
            System.out.println("这是一个局部代码块，可以提前释放内存");
        }
        student stu= new student();
        }
    }


    class student{
    static {
        System.out.println("我是一个静态代码快，随着类的加载而进行");
    }
        {
            System.out.println("我是构造代码快，我比构造方法先运行");
        }
    student(){
        System.out.println("这是一个无参构造");
    }
    student(int num){
        System.out.println("这是一个带参构造");

    }

    }
