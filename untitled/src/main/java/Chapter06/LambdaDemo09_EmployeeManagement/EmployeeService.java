package Chapter06.LambdaDemo09_EmployeeManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeService {
    public List<Employee> filter(List<Employee> list,Predicate<Employee> predicate){
        List<Employee> newList = new ArrayList<>();
        for (Employee employee : list){
            if (predicate.test(employee)){
               newList.add(employee);
            }
        }
        return newList;
    }

    public List<Employee> sort(List<Employee> list,Comparator<Employee> comparator){
        list.sort(comparator);
        return list;
    }
}
