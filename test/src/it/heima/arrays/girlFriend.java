package it.heima.arrays;

public class girlFriend {
    private String name;
    private int age;
    private double tall;

    public girlFriend() {
    }

    public girlFriend(String name, int age, double tall) {
        this.name = name;
        this.age = age;
        this.tall = tall;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return tall
     */
    public double getTall() {
        return tall;
    }

    /**
     * 设置
     * @param tall
     */
    public void setTall(double tall) {
        this.tall = tall;
    }

    public String toString() {
        return "girlFriend{name = " + name + ", age = " + age + ", tall = " + tall + "}";
    }
}
