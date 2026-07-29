package Chapter06.LambdaDemo09_EmployeeManagement;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class LambdaDemo09 {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee("一",22,"研发部",12000));
        employeeList.add(new Employee("二",23,"测试部",11000));
        employeeList.add(new Employee("三",24,"产品部",10000));
        employeeList.add(new Employee("四",22,"研发部",12000));
        employeeList.add(new Employee("五",23,"测试部",12000));
        employeeList.add(new Employee("六",24,"产品部",13000));
        employeeList.add(new Employee("七",25,"研发部",9000));
        employeeList.add(new Employee("八",26,"测试部",10000));

        EmployeeService service = new EmployeeService();
        //调用任务1：筛选高工资员工
        List<Employee> list1 = service.filter(employeeList,employee -> employee.getSalary() > 10000);
        System.out.println(list1);

        //调用任务2：筛选研发部员工
        List<Employee> list2 = service.filter(employeeList,employee -> "研发部".equals(employee.getDepartment()));
        System.out.println(list2);

        //调用任务3：工资降序排序
        List<Employee> list3 = service.sort(employeeList, Comparator.comparing(Employee::getSalary).reversed());
        System.out.println(list3);

        /*
        调用任务4：复杂排序
        规则：
        第一：
        工资降序
        第二：
        年龄升序
        第三：
        姓名升序
         */
        List<Employee> list4 = service.sort(employeeList,Comparator.comparingDouble(Employee::getSalary).reversed()
                .thenComparingInt(Employee::getAge)
                .thenComparing(Employee::getName));
        System.out.println(list4);
    }
}
