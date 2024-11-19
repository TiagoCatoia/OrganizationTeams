package elements;

import visitors.OrganizationVisitor;

public class Employee implements OrganizationElement {
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public void accept(OrganizationVisitor visitor) {
        visitor.visitEmployee(this);
    }
}
