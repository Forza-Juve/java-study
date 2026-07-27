package LambdaDemo05_ConstructorReference;

public class LambdaDemo05 {
    public static void main(String[] args) {
        EmployeeCreator creator = (s,i) -> new Employee(s,i);
        Employee employee1 = creator.createEmployee("张三",22);
        System.out.println(employee1);

        EmployeeCreator creator1 = Employee::new;
        Employee employee2 = creator1.createEmployee("张三",22);
        System.out.println(employee2);
    }
}
