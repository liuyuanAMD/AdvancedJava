public class Strings {
    public static void main(String[] args) {
        int[] arr={11,22,33,44,555,66666};
         String str =getStr(arr);
        System.out.println(str);

    }
    public static String getStr(int[] arr){
        String str="[";

        for (int i = 0; i < arr.length-1; i++) {
            str+=+arr[i]+",";
        }
         str+=+arr[arr.length-1]+"]";
        return str;
    }
}
