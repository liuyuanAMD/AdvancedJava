package it.heima.arrays;

import java.util.Arrays;

public class girlTest {
    public static void main(String[] args) {
        girlFriend g=new girlFriend("小美",23,170);
        girlFriend g1=new girlFriend("小丽",22,156);
        girlFriend g2=new girlFriend("小红",21,166);
        girlFriend[] Gf={g,g1,g2};
        Arrays.sort(Gf);
        for (int i = 0; i < Gf.length; i++) {
            System.out.println(Gf[i]);
        }
    }
}
