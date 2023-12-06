package it.heima.integer;

public class test {
    public static void main(String[] args) {
        String s="11,22,33,44,55";
        String[] ARR =s.split(",");
        int [] arr=new int[ARR.length];
        for (int i = 0; i < ARR.length; i++) {
            arr[i]=Integer.parseInt(ARR[i]);
        }
        int count=getMax(arr);
        System.out.println(count);

    }


    public static int getMax(int[] arr) {
                 int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
}
