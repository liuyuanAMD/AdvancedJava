package extend.employee;

public class Manager extends Employee{
    private int bonus;

    public Manager() {

    }

    public Manager(String name, int age, int wages, int bonus) {
        super(name, age, wages);
        this.bonus = bonus;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }
    @Override
    public void work(){
        System.out.println("姓名为"+super.getName() + "，年龄为"+super.getAge()+",工资为"+super.getWages()+",奖金为"+bonus+"的项目经理正在分配任务");
    }
}
