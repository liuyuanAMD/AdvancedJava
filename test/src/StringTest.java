import java.util.Scanner;

public class StringTest {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
             String str=sc.nextLine();


             str=swapSTR(str);
        System.out.println(str);


    }
    public static String swapSTR(String str){
           char[] str1=str.toCharArray();
           String str2="";
        for (int i = str1.length-1;i>=0;i--) {
                  str2+=str1[i];

        }
        return str2;

    }
}
