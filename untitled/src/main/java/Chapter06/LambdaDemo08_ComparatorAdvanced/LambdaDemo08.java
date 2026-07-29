package Chapter06.LambdaDemo08_ComparatorAdvanced;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo08 {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("张三",22,111));
        employees.add(new Employee("李四",33,222));
        employees.add(new Employee("王五",22,222));
        employees.add(new Employee("赵六",44,111));
        employees.add(new Employee("陈七",33,333));
        //需求1：按照年龄升序
        Collections.sort(employees,((o1, o2) -> Integer.compare(o1.getAge(), o2.getAge())));
        System.out.println(employees);
        //需求2：按照工资降序
        Collections.sort(employees,(o1, o2) -> Double.compare(o2.getSalary(), o1.getSalary()));
        System.out.println(employees);
        //需求3：工资相同，按照姓名排序
        Collections.sort(employees,(o1, o2) -> {
            if(o1.getSalary() == o2.getSalary()){
                return o2.getName().compareTo(o1.getName());
            }
            return Double.compare(o2.getSalary(), o1.getSalary());
        });
        System.out.println(employees);
        //需求4：使用方法引用优化
        Collections.sort(employees,(Comparator.comparingInt(Employee::getAge)));
    }
}
