package Static;

public class test {
    public static void main(String[] args) {

        static1 sc=new static1();
        sc.name="刘源";
        sc.age=19;
        sc.school="江西工业贸易职业技术学院";
        System.out.println(sc.getName()+"---"+sc.getAge()+"---"+static1.school);
        System.out.println("----------");
        static1 sc1=new static1();
        sc1.name="刘倩";
        sc1.age=19;
        System.out.println(sc1.getName()+"---"+sc1.getAge()+"---"+sc1.school);


    }
}
