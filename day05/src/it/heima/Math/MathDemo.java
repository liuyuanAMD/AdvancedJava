package it.heima.Math;

public class MathDemo {
    public static void main(String[] args) {
            /*
        Math类 : 包含执行基本数字运算的方法

        --------------------------------------------------------------------
        public static int abs (int a) : 获取参数绝对值
        public static double ceil (double a) : 向上取整
        public static double floor (double a) : 向下取整
        public static int round (float a) : 四舍五入
        public static int max (int a, int b) : 获取两个int值中的较大值
        public static double pow (double a,double b) : 返回a的b次幂的值
        public static double random () : 返回值为double的随机值，范围[0.0,1.0)
        --------------------------------------------------------------------
     */
        System.out.println(Math.abs(-5));
        System.out.println(Math.ceil(0.66));
        System.out.println(Math.floor(20.22));
        System.out.println(Math.round(20.46));
        System.out.println(Math.max(20,21));
        System.out.println(Math.pow(2, 3));
        System.out.println(Math.random() * 100);
    }



}
