package LambdaDemo05_ConstructorReference;

@FunctionalInterface
public interface EmployeeCreator {
    Employee createEmployee(String name, int age);
}
