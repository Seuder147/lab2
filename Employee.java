public class Employee {
    protected int id;
    protected static int nextid = 0;
    protected String name;
    protected String department;
    protected double salary;

    public Employee(){
        name = "None";
        department = "None";
        salary = 0.0;
        id = 0;
    }
    public Employee (String name,double salary,int id) throws FieldLengthLimitException,IncorrectSalaryException{
        if (name.length() <= FieldLengthLimitException.maxleight){
            this.name = name;
        }
        else{
            throw new FieldLengthLimitException("Your String is too long \n");
        }
        if(salary > 0){
            this.salary = salary;
        }
        else{
            throw new IncorrectSalaryException("Salary cant be negative \n");
        }
        if(id > 0){
            this.id = id;
        }
        else{
            throw new IncorrectSalaryException("Id cant be negative \n");
        }
    }

    public void outputEmployee(){
        System.out.println("Name "+ name + " Salary " + salary + " ID " + id);
        return;
    }
    public int getId() {
        return id;
    }
    public String getName(){
        return name;
    }
    public String getDepartment(){
        return department;
    }
    public double getSalary(){
        return salary;
    }
}
