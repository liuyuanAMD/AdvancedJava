package it.heima.test;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
          /*
        冒泡排序: 相邻的两个数进行比较,  如果第一个比第二个大, 就交换他们两个

        第一轮 : arr[0]-arr[1]  arr[1]-arr[2] arr[2]-arr[3]  arr[3]-arr[4]  比较4次
        第二轮 : arr[0]-arr[1]  arr[1]-arr[2] arr[2]-arr[3]  比较3次
        第三轮 : arr[0]-arr[1]  arr[1]-arr[2] 比较2次
        第四轮 : arr[0]-arr[1]  比较1次
     */
        int[] arr={67,45,38,99,66};
        int temp=0;
        for (int i = 0; i < arr.length-1; i++) {

            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]) {
                      temp=arr[j];
                     arr[j]=arr[j+1];
                      arr[j+1]=temp;
                }



            }
            System.out.println(Arrays.toString(arr));


        }
        }

    }

