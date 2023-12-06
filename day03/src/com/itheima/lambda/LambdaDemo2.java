package com.itheima.lambda;

public class LambdaDemo2 {
    public static void main(String[] args) {
        InterBto(new InterB() {
            @Override
            public void show() {

            }

            @Override
            public void hide() {

            }
        });
    }

        public static void InterBto (InterB b){
            b.show();
            b.hide();
        }



    interface InterB {
        void show();

        void hide();

    }
}