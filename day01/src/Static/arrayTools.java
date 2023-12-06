package Static;

public class arrayTools {
    private arrayTools(){

    }

    public static int getMAX(int[] array){
        int max=0;
        for (int i = 0; i < array.length; i++) {
            if (array[i]>max){
                max=array[i];

            }
        }
        return max;
    }
    public static int getMin(int[] array){
        int min=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i]<min){
                min=array[i];

            }
        }
        return min;
    }
    public static void copyarray(int[] array){
        System.out.print("[");
        for (int i = 0; i < array.length-1; i++) {
            System.out.print(+array[i]+",");
        }
        System.out.print(array[array.length-1]+"]");
    }

}


