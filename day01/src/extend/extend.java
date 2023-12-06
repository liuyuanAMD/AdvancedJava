package extend;

public class extend {
    public static void main(String[] args) {
        Coders c=new Coders();
        c.setAge(18);
        c.setName("刘源");
        c.setSlary(12000);
        System.out.println(c.getName()+"----- "+c.getAge()+"--- "+c.getSlary());
    }
}
 class employees{
    private String name;
    private int age;
    private int slary;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public int getAge() {
         return age;
     }

     public void setAge(int age) {
         this.age = age;
     }

     public int getSlary() {
         return slary;
     }

     public void setSlary(int slary) {
         this.slary = slary;
     }
 }
 class Coders extends employees{

 }
 class Manager extends employees{

 }
