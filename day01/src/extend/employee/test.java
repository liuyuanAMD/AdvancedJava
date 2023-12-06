package extend.employee;

public class test {
    public static void main(String[] args) {
        Coder c=new Coder("张三",23,15000);
        c.work();
        System.out.println("-------------------");
        Manager m=new Manager("李四",24,18000,5000);
        m.work();
    }
}
