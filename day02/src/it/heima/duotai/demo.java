package it.heima.duotai;

public class demo {
    public static void main(String[] args) {
        fu f=new zi();
        f.eat();
        System.out.println(f.num);
        f.Animal();

    }
}
class fu{
      int num=10;
    void eat(){
        System.out.println("老子吃饭");
    }
    public static void Animal(){
        System.out.println("我是狗");
    }


}

class zi extends fu{
    int num=20;


}
