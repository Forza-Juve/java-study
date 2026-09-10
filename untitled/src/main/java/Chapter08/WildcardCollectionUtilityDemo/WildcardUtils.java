package Chapter08.WildcardCollectionUtilityDemo;

public class WildcardUtils {
    public static Number getValue(NumberBox<? extends Number> numberBox){
        return numberBox.getValue();
    }

    public static void setValue(NumberBox<? super Integer> numberBox,Integer integer){
        numberBox.setValue(integer);
    }

    public static void test(NumberBox<? extends Number> numberBox){
        System.out.println(numberBox);
    }
}
