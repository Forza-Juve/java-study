package Chapter09.EmployeeRosterDemo;

import java.util.Collections;
import java.util.List;

public class EmployeeRoster {
    private List<String> employees;

    public EmployeeRoster(List<String> employees){
        this.employees = employees;
    }

    public void addEmployee(String name){
        employees.add(name);
    }

    public void removeRange(int from,int to){
        employees.subList(from, to).clear();
    }

    public List<String> getReadOnlyView(){
        return Collections.unmodifiableList(employees);
    }

    public List<String> getCheckedRawAccess(){
        return Collections.checkedList(employees, String.class);
    }

    public int size(){
        return employees.size();
    }

    public void addAll(List<String> names){}
}
