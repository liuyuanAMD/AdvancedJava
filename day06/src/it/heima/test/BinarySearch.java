package it.heima.test;

import static java.util.Arrays.binarySearch;

public class BinarySearch {
    public static void main(String[] args) {
         /*
        二分查找 (折半查找) :

            前提: 数组元素必须是排好序的

            思路:
                    1. 定义两个变量记录最小索引, 和最大索引
                    2. 折半的动作不止一次, 应该使用循环
                            条件 while(min <= max)
                    3. 循环中计算出中间索引
                    4. 加入判断
                        元素如果大于中间元素 : min = mid + 1;
                        元素如果小于中间元素 : max = mid – 1;
                        元素如果等于中间元素 : 将索引返回 (mid)

     */
        int[] arr={11,22,33,44,55,66,77,88,99};
                   int index=binaryCheck(arr,33);
        System.out.println(index);


    }

    private static int binaryCheck(int[] arr, int i) {
        int min=0;
        int max=arr.length-1;
        int mid;
        while (min<=max){
            mid=(min+max)/2;
            if(arr[mid]>i){
                max=mid-1;
            }
            else if (arr[mid]<i) {
                min=mid+1;
            }
            else{
                return mid;

            }
        }
        return -1;
    }
}
