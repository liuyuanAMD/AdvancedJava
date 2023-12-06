package it.heima.Order;

public class OverseaServiceImpl implements OrderService{
    @Override
    public void create() {
        System.out.println("国外业务---创建订单");

    }

    @Override
    public void findOne() {
        System.out.println("国外业务---查询单个订单");

    }

    @Override
    public void findList() {
        System.out.println("国外业务---查询订单列表");

    }

    @Override
    public void cancel() {
        System.out.println("国外业务---取消订单");

    }

    @Override
    public void finish() {
        System.out.println("国外业务---完结订单");


    }

    @Override
    public void pay() {
        System.out.println("国外业务---支付订单");

    }
    public void check(){
        System.out.println("检测IP地址");
    }
}
