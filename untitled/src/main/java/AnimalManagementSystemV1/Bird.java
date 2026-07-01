package AnimalManagementSystemV1;

public class Bird extends Animal{
    @Override
    public void speak() {
        System.out.println("叽叽叽");
    }

    public void fly(){
        System.out.println("鸟飞了起来");
    }
}
