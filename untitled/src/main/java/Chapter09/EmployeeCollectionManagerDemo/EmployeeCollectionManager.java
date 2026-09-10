package Chapter09.EmployeeCollectionManagerDemo;

import java.util.ArrayList;
import java.util.Collection;

public class EmployeeCollectionManager {
    private Collection<Employee> employees = new ArrayList<>();

    public boolean addEmployee(Employee employee){
        return employees.add(employee);
    }

    public boolean containsEmployee(Employee employee){
        return employees.contains(employee);
    }

    public int getEmployeeCount(){
        return employees.size();
    }

    public void printAllEmployees(){
        for (Employee employee : employees){
            System.out.println(employee);
        }
    }

    public int removeInactiveEmployees(){
        int afterSize = employees.size();
        employees.removeIf(employee -> !employee.isActive());
        int beforeSize = employees.size();
        return afterSize - beforeSize;
    }
}
