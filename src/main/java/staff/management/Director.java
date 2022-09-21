package staff.management;

public class Director extends Manager{
    private double budget;

    public Director(String name, String nationalInsuranceNumber, int salary, String deptName, double budget) {
        super(name, nationalInsuranceNumber, salary, deptName);
        this.budget = budget;
    }

    @Override
    public double payBonus() {
        return this.getSalary() * 0.02;
    }

    public double getBudget() {
        return budget;
    }
}
