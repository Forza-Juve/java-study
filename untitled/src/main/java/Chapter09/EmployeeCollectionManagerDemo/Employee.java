package Chapter09.EmployeeCollectionManagerDemo;

public class Employee {
    private Long id;
    private String name;
    private String department;
    private boolean active;

    public Employee(Long id, String name, String department, boolean active) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.active = active;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public boolean isActive() {
        return active;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", active=" + active +
                '}';
    }
}
