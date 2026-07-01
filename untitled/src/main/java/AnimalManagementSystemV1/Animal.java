package AnimalManagementSystemV1;

public abstract class Animal {
    protected String color;

    public void sleep(int time){
        System.out.printf("睡了%d秒.",time);
    }

    public abstract void speak();

    public final void dead(){
        System.out.println("动物死了");
    }
}
