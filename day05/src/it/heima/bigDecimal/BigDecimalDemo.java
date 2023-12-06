package it.heima.bigDecimal;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class BigDecimalDemo {
    public static void main(String[] args) {
  /*
        BigDecimal类 : 解决小数运算中, 出现的不精确问题

        BigDecimal创建对象 :

                public BigDecimal(double val) : 不推荐, 无法保证小数运算的精确
                ---------------------------------------------------------------
                public BigDecimal(String val)
                public static BigDecimal valueOf(double val)
                */
        BigDecimal bd=new BigDecimal("0.3");
        BigDecimal bd2=new BigDecimal("0.3");
        System.out.println(bd.add(bd2));

        BigDecimal resu=BigDecimal.valueOf(230);
        BigDecimal resu2=BigDecimal.valueOf(200.1);
        System.out.println(resu.add(resu2));


        /*BigDecimal常用成员方法 :

                public BigDecimal add(BigDecimal b) : 加法
                public BigDecimal subtract(BigDecimal b) : 减法
                public BigDecimal multiply(BigDecimal b) : 乘法
                public BigDecimal divide(BigDecimal b) : 除法
                public BigDecimal divide (另一个BigDecimal对象，精确几位，舍入模式) : 除法

        注意: 如果使用BigDecimal运算, 出现了除不尽的情况, 就会出现异常
     */
        System.out.println(resu.add(resu2));
        System.out.println(resu.subtract(resu2));
        System.out.println(resu.multiply(resu2));
        System.out.println(resu.divide(resu2,2, RoundingMode.HALF_UP));
        System.out.println(resu.divide(resu2,2, RoundingMode.HALF_DOWN));
        System.out.println(resu.divide(resu2,2, RoundingMode.FLOOR));

        int result= resu.intValue();
        System.out.println(result);




    }
}
