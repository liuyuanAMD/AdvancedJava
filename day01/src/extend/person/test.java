package extend.person;

public class test {
    public static void main(String[] args) {
        teacher t=new teacher();
        t.setName("黑马程序员");
        t.setAge(20);
        t.show();
        student s=new student("s1",19,199);
        s.showStudent();
    }
}
