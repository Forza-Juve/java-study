package AnimalManagementSystemV1;

public class Cat extends Animal{
    @Override
    public void speak() {
        System.out.println("喵喵喵");
    }

    public void catchMouse(){
        System.out.println("猫抓住了老鼠");
    }
}
