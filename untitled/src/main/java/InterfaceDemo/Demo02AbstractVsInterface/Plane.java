package InterfaceDemo.Demo02AbstractVsInterface;

public class Plane extends Vehicle implements Flyable{
    @Override
    public void fly() {
        System.out.println("起飞");
    }

    @Override
    public void start() {
        System.out.println("启动");
    }

    @Override
    public void stop() {
        System.out.println("停止");
    }
}
