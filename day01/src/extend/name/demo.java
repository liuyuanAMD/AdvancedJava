package extend.name;

import org.w3c.dom.ls.LSOutput;

public class demo {
    public static void main(String[] args) {
        Zi z=new Zi();
        z.printNum();
        z.show();
    }

}

class Fu{
    int num=20;
    public void show(){
        System.out.println("Fu---show");
    }
}
class Zi extends Fu{
    int num=10;
    public void printNum(){
        System.out.println(num);
        System.out.println(super.num);
    }
    @Override
    public void show(){
        super.show();
        System.out.println("Zi---show");
    }
}
