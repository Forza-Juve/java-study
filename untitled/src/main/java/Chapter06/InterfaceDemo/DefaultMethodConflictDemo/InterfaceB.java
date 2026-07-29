package Chapter06.InterfaceDemo.DefaultMethodConflictDemo;

public interface InterfaceB {
    default void show(){
        System.out.println("InterfaceB show");
    }
}
