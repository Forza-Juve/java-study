package InterfaceDemo.DefaultMethodConflictDemo;

public class MyClass implements InterfaceA,InterfaceB{
    @Override
    public void show() {
        InterfaceA.super.show();
        InterfaceB.super.show();
        System.out.println("MyClass show");
    }
}
