package it.heima.Minterface;

public class interfaceTest {
    public static void main(String[] args) {
        test t=new test();
        t.hide();
        t.show();

    }




}
class  test implements Inter{

    @Override
    public void show() {
        System.out.println("表演");

    }

    @Override
    public void hide() {
        System.out.println("biaoyan");

    }
}
