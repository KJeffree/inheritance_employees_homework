package Staff;

public abstract class Employee {
    private String name;
    private int nationalInsurance;
    private double salary;

    public Employee(String name, int nationalInsurance, double salary){
        this.name = name;
        this.nationalInsurance = nationalInsurance;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getNationalInsurance(){
        return this.nationalInsurance;
    }

    public double getSalary(){
        return this.salary;
    }

    public void raiseSalary(double salaryIncrease){
        if (salaryIncrease < 0) {
            this.salary -= salaryIncrease;
        } else {
            this.salary += salaryIncrease;
        }
    }

    public double payBonus(){
        return this.salary / 100;
    }

    public void setName(String name){
        if (name != "") {
            this.name = name;
        }
    }
}
