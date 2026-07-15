package ComparatorDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeComparatorTest {
    public static void main(String[] args) {
        Employee e1 = new Employee("张三",25,8000);
        Employee e2 = new Employee("李四",30,10000);
        Employee e3 = new Employee("王五",22,6000);
        Employee e4 = new Employee("赵六",28,8000);
        Employee e5 = new Employee("陈七",35,12000);

        List<Employee> employeeList = new ArrayList<>(List.of(new Employee[]{e1, e2, e3, e4, e5}));

        //按照工资升序排序
        employeeList.sort((o1, o2) -> o1.getSalary() - o2.getSalary());
        System.out.println(employeeList);

        //工资相同，按照姓名排序
        employeeList.sort(((o1, o2) -> {
            if (o1.getSalary() == o2.getSalary()){
                return o1.getName().compareTo(o2.getName());
            } else {
                return o1.getSalary() - o2.getSalary();
            }
        }));

        System.out.println(employeeList);
    }
}
