public class EmployeeFactory {
    public static Employee createManagementStaff(){
        return new Employee("Management",8888);
    }

    public static Employee createOrdinaryStaff(){
        return new Employee("Ordinary",4444);
    }
}
