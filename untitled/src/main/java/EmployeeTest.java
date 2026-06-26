public class EmployeeTest {
    public static void main(String[] args) {
        Employee messi = new Employee("messi",12345.6);
        Employee ronaldo = new Employee("ronaldo",11111.1);

        Employee ordinary = EmployeeFactory.createOrdinaryStaff();
        Employee management = EmployeeFactory.createManagementStaff();

        messi.raise(5);
        ronaldo.raise(6);

        messi.printEmployeeInfo();
        ronaldo.printEmployeeInfo();
        ordinary.printEmployeeInfo();
        management.printEmployeeInfo();

        Employee.company = "drive";

        ordinary.printEmployeeInfo();


    }
}
