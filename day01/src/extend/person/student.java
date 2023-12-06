package extend.person;

public class student extends person{
     private int score;

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public student() {
    }

    public student(String name, int age,int score) {
        super(name, age);
        this.score = score;
    }
    public void showStudent(){
        System.out.println(super.getName()+"----------"+super.getAge()+"---"+score);
    }
}
