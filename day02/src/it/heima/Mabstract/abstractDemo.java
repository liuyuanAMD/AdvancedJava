package it.heima.Mabstract;

public class abstractDemo {

}

 abstract class Animal{
    public abstract void eat();
}

class cat extends Animal{


    @Override
    public void eat() {
        System.out.println("吃鱼");

    }
}
class dog extends Animal{

    @Override
    public void eat() {
        System.out.println("吃肉");
    }
}
