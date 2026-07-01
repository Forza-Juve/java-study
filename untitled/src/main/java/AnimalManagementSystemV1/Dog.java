package AnimalManagementSystemV1;

public class Dog extends Animal{
    @Override
    public void speak() {
        System.out.println("汪汪汪");
    }

    public void guardHouse(){
        System.out.println("狗开始看门");
    }
}
