package extend.employee;

public  abstract class Employee {
    private String name;
    private int age;
    private int wages;

    public Employee() {
    }

    public Employee(String name, int age, int wages) {
        this.name = name;
        this.age = age;
        this.wages = wages;
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
     * @return wages
     */
    public int getWages() {
        return wages;
    }

    /**
     * 设置
     * @param wages
     */
    public void setWages(int wages) {
        this.wages = wages;
    }
    public  abstract void  work();



}
