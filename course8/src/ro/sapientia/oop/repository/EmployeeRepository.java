package ro.sapientia.oop.repository;

import ro.sapientia.oop.model.Employee;
import ro.sapientia.oop.model.Manager;

import java.util.ArrayList;

public class EmployeeRepository {
    //polimorfikus tarolo
    private ArrayList<Employee> emps = new ArrayList<>();

    public EmployeeRepository() {
        init();
    }

    private void init() {
        emps.add(new Employee("Ambrus", "Botond", 2000));
        emps.add(new Employee("Nemes", "Szidonia", 1500));
        emps.add(new Employee("Veress", "Evelin", 1000));
        emps.add(new Manager("Mate", "Botond", 2500, "Android"));
        emps.add(new Manager("Ambrus", "Arpad", 2000, "iOS"));
    }


    public ArrayList<Employee> getAllEmployees(){
        return emps;
    }

    public int countAtLeastManagers(){
        int numManagers = 0;
        for(Employee e:emps ){
            if( e instanceof Manager){
                numManagers++;
            }
        }
        return numManagers;
    }

    public int countJustEmployees(){
        int numEmployees = 0;
        for(Employee e: emps){
            // e.getClass() - a hivatkozott objektum pontos tipusa
            if( e.getClass() == Employee.class){
                ++numEmployees;
            }
        }
        return numEmployees;
    }


}
