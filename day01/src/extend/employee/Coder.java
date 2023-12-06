package extend.employee;
public class Coder extends Employee{
    public Coder() {
    }

    public Coder(String name, int age, int wages) {
        super(name, age, wages);
    }

    @Override
    public void  work(){
        System.out.println("姓名为"+super.getName()+"年龄为"+super.getAge()+"工资为"+super.getWages()+"正在编写代码");
    }
}
