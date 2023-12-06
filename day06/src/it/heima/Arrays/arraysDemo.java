package it.heima.Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;

public class arraysDemo {
    public static void main(String[] args) {
         /*
        Arrays类常用方法 :
        -------------------------------------------------------------------------------------------
        public static String toString (类型[] a) : 将数组元素拼接为带有格式的字符串
        public static boolean equals (类型[] a, 类型[] b) : 比较两个数组内容是否相同
        public static int binarySearch (int[] a, int key) : 查找元素在数组中的索引 (二分查找法: 保证数组的元素是排好序的)
                                                                - 如果查找的元素, 在数组中不存在: 返回 (-(插入点) - 1)
        public static void sort (类型[] a) : 对数组进行默认升序排序
                    TODO: 后面学完了红黑树, 回头对这个方法做补充
        -------------------------------------------------------------------------------------------
     */
        String[] s1={"刘源", "刘倩"};
        System.out.println(Arrays.toString(s1));
        int[] arr={11,2,33};
        int[] arr1={11,22,33};
        System.out.println(Arrays.equals(arr, arr1));
        int[] arr2={11,22,44,33,55};
        System.out.println(Arrays.binarySearch(arr2, 33));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}
