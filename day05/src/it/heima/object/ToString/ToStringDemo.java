package it.heima.object.ToString;

public class ToStringDemo {
    public static void main(String[] args) {
        A a=new A();
        System.out.println(a);
        System.out.println(a.toString());
        System.out.println("---------");
        Student student=new Student("刘源",25);
        System.out.println(student);
        System.out.println(student.toString());
    }
}
class A{
    @Override
    public String toString() {
        return "我是大哥";
    }
}
