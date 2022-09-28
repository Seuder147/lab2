public class Manager extends Employee {
    private double bonus;

    public double getBonus() {
        return bonus;
    }

    public Manager() {}

    public Manager(String name, double salary,int id, double bonus) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.bonus = bonus;
    }

    public void outputEmployee(){
        System.out.println("Name "+ name + " Salary " + salary + " ID " + id + " Bonus " + bonus);
        return;
    }
}
