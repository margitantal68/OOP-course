package ro.sapientia.oop;

import ro.sapientia.oop.model.Employee;
import ro.sapientia.oop.repository.EmployeeRepository;

import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        EmployeeRepository repository = new EmployeeRepository();
        ArrayList<Employee> emps = repository.getAllEmployees();
        for(Employee emp: emps){
            System.out.println(emp);
        }
        System.out.println("***********************");
        System.out.println("#at_least_managers: " + repository.countAtLeastManagers());
        System.out.println("#just_employees: " + repository.countJustEmployees());

        System.out.println("***********************");
        System.out.println("Sorted by decreasing salary");
        Collections.sort(emps);
        for(Employee emp: emps){
            System.out.println(emp);
        }


    }



}


