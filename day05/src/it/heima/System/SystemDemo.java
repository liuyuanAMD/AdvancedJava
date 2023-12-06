package it.heima.System;

public class SystemDemo {
    public static void main(String[] args) {
            /*
        System类常见方法 :

            1. public static void exit (int status) : 终止当前运行的 Java 虚拟机，非零表示异常终止
            2. public static long currentTimeMillis () : 返回当前系统的时间毫秒值形式
                                                                - 返回1970年1月1日 0时0分0秒, 到现在所经历过的毫秒值

            3. public static void arraycopy(Object src, int srcPos, Object dest, int destPos, int length) : 数组拷贝

                                                        1. 数据源数组
                                                        2. 起始索引
                                                        3. 目的地数组
                                                        4. 起始索引
                                                        5. 拷贝的个数
     */

        int[] arr={11,22,33,44,55};
        int[] dest = new int[3];
        System.arraycopy(arr, 2, dest, 0,3);
        for (int i = 0; i < dest.length; i++) {
            System.out.println(dest[i]);
        }

      time();

    }
    public static void time(){
          long now = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10000; i++) {
            sb.append(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-now);


    }
}
