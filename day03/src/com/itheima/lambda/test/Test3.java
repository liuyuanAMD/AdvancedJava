package com.itheima.lambda.test;

import java.util.Random;

public class Test3 {
    public static void main(String[] args) {
        getrandom(new returnRandom() {
            @Override
            public int returnRandom() {

                return new Random().nextInt(100)+1;

            }
        });
        System.out.println("--------------");



        getrandom(()->new Random().nextInt(100)+1);
    }
    public static void  getrandom(returnRandom r){
        int result= r.returnRandom();
        System.out.println(result);
    }
}
interface returnRandom{
    int returnRandom();
}