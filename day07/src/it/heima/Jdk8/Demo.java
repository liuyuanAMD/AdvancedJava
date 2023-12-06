package it.heima.Jdk8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Demo {
       /*
        ------------------------------------------
        LocalDate、LocalTime、LocalDateTime

        对象的创建方式:

        1. now() : 当前时间

        2. of(...) : 设置时间

        ------------------------------------------
        LocalDateTime 转换LocalDate, LocalTime

        1. toLocalDate()
        2. toLocalTime()
     */
       public static void main(String[] args) {
               LocalDateTime NowTime = LocalDateTime.now();
               System.out.print(NowTime.getYear() + "年");
               System.out.print(NowTime.getMonthValue() + "月");
               System.out.print(NowTime.getDayOfMonth() + "日");
               System.out.print(NowTime.getHour() + "时");
               System.out.print(NowTime.getMinute() + "分");
               System.out.print(NowTime.getSecond() + "秒");
               System.out.print(NowTime.getNano() + "呐秒");
               System.out.println("");
            LocalDateTime of=LocalDateTime.of(2023,5,5,5,50,52);
           System.out.print(of.getYear() + "年");
           System.out.print(of.getMonthValue() + "月");
           System.out.print(of.getDayOfMonth() + "日");
           System.out.print(of.getHour() + "时");
           System.out.print(of.getMinute() + "分");
           System.out.print(of.getSecond() + "秒");
           System.out.print(of.getNano() + "呐秒");
           }
       }

