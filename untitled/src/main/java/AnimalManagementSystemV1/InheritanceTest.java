package AnimalManagementSystemV1;

public class InheritanceTest {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();
        Animal bird = new Bird();

        Animal[] animals = {dog,cat,bird};

        for (Animal a : animals){
            a.speak();
        }

        Animal animal = new Dog();
        Dog dog1 = null;

        if (animal instanceof Dog){
            dog1 = (Dog)animal;
            dog1.guardHouse();
        }

        animal.dead();

        animal.color = "white";
        System.out.println("狗的颜色是"+animal.color);

        cat.color = "black";
        System.out.println("猫的颜色是:"+cat.color);

        if(dog1 != null){
            dog1.guardHouse();
            dog1.dead();
        }
    }
}
