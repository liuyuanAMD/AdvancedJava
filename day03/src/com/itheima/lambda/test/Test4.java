package com.itheima.lambda.test;

public class Test4 {
    public static void main(String[] args) {
        returnA_B(new returnA_B() {
            @Override
            public int AaddB(int a, int b) {
                return a-b;
            }
        });
        System.out.println("-----------");
        returnA_B(( a,b)->a + b);
    }
    public static void returnA_B(returnA_B add){
        int result=add.AaddB(10,20);
        System.out.println(result);
    }
}
interface returnA_B{
    int AaddB(int a, int b);
}