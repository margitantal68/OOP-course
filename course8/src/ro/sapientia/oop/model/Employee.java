package ro.sapientia.oop.model;

public class Employee implements Comparable<Employee>{
    private final int ID;
    private static int counter;
    private String firstName;
    private String lastName;
    private double salary;

    public Employee(String firstName, String lastName, double salary) {
        this.ID = counter++;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    public int getID() {
        return ID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return  firstName + ", " + lastName + ", " + salary;
    }


    @Override
    public int compareTo(Employee o) {
        // this < o??? {-int, 0, +int}
        return -Double.compare(this.salary, o.salary);
    }
}

