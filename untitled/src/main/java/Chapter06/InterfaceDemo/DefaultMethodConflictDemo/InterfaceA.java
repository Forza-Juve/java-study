package Chapter06.InterfaceDemo.DefaultMethodConflictDemo;

public interface InterfaceA {
    default void show(){
        System.out.println("InterfaceA show");
    }
}
