package it.heima.object.equals;

import it.heima.object.ToString.Student;

import java.util.ArrayList;

public class equalsDemo {
    public static void main(String[] args) {
        Student stu=new Student("哈登",26);
        Student stu1=new Student("哈登",26);
        ArrayList<String> arrayList=new ArrayList<>();
        System.out.println(stu.equals(arrayList));
        System.out.println(stu.equals(stu1));

    }
}
