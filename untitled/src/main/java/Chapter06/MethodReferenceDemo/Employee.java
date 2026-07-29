package Chapter06.MethodReferenceDemo;

public class Employee {
    private String name;

    public Employee(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Chapter04.Employee{" +
                "name='" + name + '\'' +
                '}';
    }
}
