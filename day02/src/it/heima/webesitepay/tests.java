package it.heima.webesitepay;

import java.util.Scanner;

public class tests {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请选择你的支付方式：1.支付平台支付2.银行卡网银支付3.信用卡快捷支付");
        System.out.println("请输入你的支付方式");
        int choice=sc.nextInt();
        pay p=null;
        switch (choice) {
            case 1:
                p=new apppay();
                break;
                case 2:
                    p=new XingYongKaPay();
                    break;
            case 3:
                p=new YingHangKa();

        }
        System.out.println("请输入你的支付金钱：");
        int money=sc.nextInt();
        p.payto(money);


    }
}
