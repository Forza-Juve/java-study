public class EmployeePracticeArena {
    public static void main(String[] args) {
        /*
        创建多个 Employee
        修改一个员工工资
        验证其他对象不受影响
         */
        Employee[] employees = new Employee[3];
        for (int i = 0; i < employees.length; i++) {
            employees[i] = new Employee("employee"+i,( i + 1 ) * 100);
            employees[i].printEmployeeInfo();
        }
        employees[0].raise(5);

        employees[0].printEmployeeInfo();
        employees[1].printEmployeeInfo();

        /*
        修改 company
        所有对象打印结果一致变化
         */
        Employee.company = "jog";

        for (Employee e : employees){
            e.printEmployeeInfo();
        }

        /*
        创建一个引用 = 另一个引用
        修改一个引用
        观察另一个是否变化
         */
        Employee e1 = new Employee("e1",1234);
        Employee e2 = e1;
        e2.raise(10);
        e1.printEmployeeInfo();

        /*
        对每个方法判断：
        是修改对象？
        还是只返回结果？
         e2是修改了e1的对象，因为e1和e2指向同一个对象
         */
    }
}
