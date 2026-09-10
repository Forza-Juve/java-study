package Chapter08.GenericPairUtilityDemo;

public class PairUtils {

    public static void swap(Pair<?> pair){
        realSwap(pair);
    }

    public static Object getFirst(Pair<?> pair){
        return pair.getFirst();
    }

    public static void setEmployee(Pair<? super Employee> pair,Employee employee){
        /*
        要求：将传入的 Employee 设置到 Pair 的两个位置。
         */
        pair.setFirst(employee);
        pair.setSecond(employee);
    }

    private static <T> void realSwap(Pair<T> pair){
        T temp = pair.getFirst();
        pair.setFirst(pair.getSecond());
        pair.setSecond(temp);
    }

    public static void test(Pair<? extends Employee> pair){
        System.out.println(pair);
    }
}
