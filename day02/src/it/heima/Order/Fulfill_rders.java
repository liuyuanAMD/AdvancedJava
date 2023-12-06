package it.heima.Order;

import java.util.Scanner;

public class Fulfill_rders {
    public static void main(String[] args) {


        OrderService orderService = null;
        Scanner sc=new Scanner(System.in);
        int choice = sc.nextInt();
        switch (choice) {
            case 1:
                orderService=new OverServiceImpl();
                break;
            case 2:
                orderService =new OverseaServiceImpl();
                break;

        }
        if(orderService instanceof OverseaServiceImpl) {
            OverseaServiceImpl o = (OverseaServiceImpl) orderService;
            o.check();
        }

        orderService.create();
        orderService.findOne();
        orderService.findList();
        orderService.cancel();
        orderService.finish();
        orderService.pay();


    }
}
