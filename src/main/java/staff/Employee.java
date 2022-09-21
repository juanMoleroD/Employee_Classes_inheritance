package staff;

public abstract class Employee {
    private String name;
    private String nationalInsuranceNumber;
    private int salary;

    public Employee(String name, String nationalInsuranceNumber, int salary) {
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public void raiseSalary(double amount){
        if (amount > 0) salary += amount;
    }

    public double payBonus(){
        return salary * 0.01;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws Exception{
        try {
            if (!name.equals(null)) this.name = name;
        } catch (Exception e) {
            System.err.println("Name cannot be Null");
        }
    }

    public String getNationalInsuranceNumber() {
        return nationalInsuranceNumber;
    }

    public void setNationalInsuranceNumber(String nationalInsuranceNumber) {
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
