package InterfaceDemo.DefaultMethodConflictDemo;

public class DefaultMethodTest {
    public static void main(String[] args) {
        InterfaceA a = new MyClass();
        a.show();
        InterfaceB b = (InterfaceB) a;
        b.show();
    }
}
