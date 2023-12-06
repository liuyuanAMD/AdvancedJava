package it.heima;

public class busishentu {
    public static void main(String[] args) {
       int[] arr=new int[12];
       arr [0]=1;
       arr [1]=1;
        for (int i = 2; i < arr.length; i++) {

            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(arr[11]);
    }
}