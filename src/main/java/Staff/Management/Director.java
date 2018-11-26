package Staff.Management;

public class Director extends Manager {

    private double budget;

    public Director(String name, int nationalInsurance, double salary, String deptName){
        super(name, nationalInsurance, salary, deptName);
        this.budget = 3000000;

    }

    public double getBudget(){
        return this.budget;
    }

    public double payBonus(){
        return this.getSalary() / 100 * 2;
    }
}
