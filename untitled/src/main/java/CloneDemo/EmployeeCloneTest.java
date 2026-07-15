package CloneDemo;

public class EmployeeCloneTest {
    public static void main(String[] args) {
        Employee employee  = new Employee("张三",25,new Department("开发部"));
        Employee employeeCopy = employee.clone();

        System.out.println(employee == employeeCopy);

        System.out.println(employee.getDepartment() == employeeCopy.getDepartment());

        employeeCopy.getDepartment().setName("测试部");

        System.out.println(employee);
        System.out.println(employeeCopy);
    }
}
