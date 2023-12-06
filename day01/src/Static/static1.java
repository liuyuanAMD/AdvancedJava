package Static;

public class static1 {
    String name;
    int age;
    static String school;


    public static1() {
    }

    public static1(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    /**
     * 获取
     * @return school
     */
    public static String getSchool() {
        return school;
    }

    /**
     * 设置
     * @param school
     */
    public static void setSchool(String school) {
        static1.school = school;
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



}
