package it.heima.webesitepay;

public class apppay  implements  pay{

    @Override
    public void payto(double money) {
        System.out.println("通过支付平台支付了："+money+"元！");

    }
}
