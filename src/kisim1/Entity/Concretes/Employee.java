package kisim1.Entity.Concretes;

public class Employee extends Person {

    private double salary;

    public Employee(int id, String firstName, String lastName, String identityNumber, int year, double salary) {
        super(id, firstName, lastName, identityNumber, year);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
