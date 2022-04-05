package ro.sapientia.oop.model;


public class Manager extends Employee {
    private String department;

    public Manager(String firstName, String lastName, double salary, String department) {
        super(firstName, lastName, salary);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + department;
    }
}
