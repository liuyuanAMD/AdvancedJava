package extend.person;

public class teacher  extends person{
    public teacher() {
    }

    public teacher(String name, int age) {
        super(name, age);
    }
    public void show(){
        System.out.println(super.getName() + "---" +super.getAge());
    }
}
