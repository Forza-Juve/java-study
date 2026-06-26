public class Employee {
    private final String name;
    private double salary;
    public static String company = "football";

    Employee(String name,double salary){
        this.name = name;
        this.salary = salary;
    }

    public void raise(int percent){
        double increase = this.salary * percent / 100;
        this.salary += increase;
    }

    public void printEmployeeInfo(){
        System.out.printf("name:%s,salary%.2f,company:%s%n",this.name,this.salary,Employee.company);;
    }
}
