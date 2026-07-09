package InterfaceDemo.Demo02AbstractVsInterface;

public class Demo2Test {
    public static void main(String[] args) {
        Vehicle vehicle = new Plane();
        vehicle.start();
        vehicle.stop();
        Flyable flyable = new Plane();
        flyable.fly();
    }
}
