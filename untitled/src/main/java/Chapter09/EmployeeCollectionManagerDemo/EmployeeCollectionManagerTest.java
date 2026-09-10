package Chapter09.EmployeeCollectionManagerDemo;

public class EmployeeCollectionManagerTest {
    public static void main(String[] args) {
        /*
        Test 1：添加员工
        创建至少 2 个员工
        添加到 Manager
        验证返回值
        验证员工数量
         */
        EmployeeCollectionManager ecm = new EmployeeCollectionManager();
        boolean added1 = ecm.addEmployee(new Employee(1L,"A","开发部",true));
        boolean added2 = ecm.addEmployee(new Employee(2L,"B","市场部",true));
        System.out.println(added1+","+added2);
        int employeeNum = ecm.getEmployeeCount();
        System.out.println(employeeNum);

        /*
        Test 2：判断员工是否存在
        添加员工
        验证存在的员工
        验证不存在的员工
         */
        Employee employee3 = new Employee(3L,"C","开发部",true);
        Employee employee4 = new Employee(4L,"D","开发部",false);
        ecm.addEmployee(employee3);
        boolean contain1 = ecm.containsEmployee(employee3);
        boolean contain2 = ecm.containsEmployee(employee4);
        System.out.println(contain1+","+contain2);

        /*
        Test 3：遍历员工
        添加多个员工
        调用 printAllEmployees()
        确认所有员工都被访问
         */
        ecm.addEmployee(employee4);
        ecm.printAllEmployees();

        /*
        Test 4：删除非激活员工
         */
        ecm.addEmployee(new Employee(5L,"E","KF",false));
        System.out.println("原始数量："+ecm.getEmployeeCount());
        int removeCount = ecm.removeInactiveEmployees();
        System.out.println("删除数量："+removeCount);
        System.out.println("剩余数量："+ecm.getEmployeeCount());
        System.out.println(ecm.containsEmployee(employee4));
        ecm.printAllEmployees();
    }
}
