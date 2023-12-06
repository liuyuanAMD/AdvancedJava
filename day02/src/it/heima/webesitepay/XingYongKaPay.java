package it.heima.webesitepay;

public class XingYongKaPay implements pay{


    @Override
    public void payto(double money) {
        System.out.println("通过信用卡支付了："+money+"元！");
    }
}
