package LambdaDemo03_Comparator;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LambdaDemo03 {
    public static void main(String[] args) {
        /*
        Tom      25   8000
        Alice    22   9000
        Bob      25   7000
        David    30   9000
        Mike     22   7000
         */
        Employee tom = new Employee("Tom",25,8000);
        Employee alice = new Employee("Alice",22,9000);
        Employee bob = new Employee("Bob",25,7000);
        Employee david = new Employee("David",30,9000);
        Employee mike = new Employee("Mike",22,7000);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(tom);
        employeeList.add(alice);
        employeeList.add(bob);
        employeeList.add(david);
        employeeList.add(mike);
        //输出原始数据
        System.out.println("输出原始数据:"+employeeList);
        //按年龄升序排序
        Collections.sort(employeeList,(o1,o2) -> o1.getAge() - o2.getAge());
        System.out.println("按年龄升序排序:"+employeeList);
        //按工资降序排序
        employeeList.sort(((o1, o2) -> o2.getSalary() - o1.getSalary()));
        System.out.println("按工资降序排序:"+employeeList);
        /*
        多条件排序（重点）
        要求：
        工资高的在前
        如果工资相同
        年龄小的在前
         */
        employeeList.sort((o1, o2) -> {
            if(o1.getSalary() == o2.getSalary()){
                return o1.getAge() - o2.getAge();
            }
            return o2.getSalary() - o1.getSalary();
        });
        System.out.println("多条件排序："+employeeList);
    }
}
