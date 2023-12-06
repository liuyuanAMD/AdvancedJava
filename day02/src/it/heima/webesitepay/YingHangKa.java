package it.heima.webesitepay;

public class YingHangKa implements pay{

    @Override
    public void payto(double money) {
        System.out.println("通过银行卡网银支付了："+money+"元！");
    }
}
