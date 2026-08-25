package Chapter08.GenericMinMaxToolDemo;

import Chapter08.GenericPairToolDemo.Pair;

public class GenericMinMaxToolTest {
    public static void main(String[] args) {
        Integer[] array1 = new Integer[]{5, 8, 3, 9, 2};
        Pair<Integer> pair1 = GenericMinMaxTool.minmax(array1);
        System.out.println(pair1);

        String[] array2 = new String[]{"Mary", "had", "a", "little", "lamb"};
        Pair<String> pair2 = GenericMinMaxTool.minmax(array2);
        System.out.println(pair2);

        Pair<Integer> pair3 = GenericMinMaxTool.minmax(new Integer[]{});
        System.out.println(pair3);

        Pair<Comparable> pair4 = GenericMinMaxTool.minmax(null);
        System.out.println(pair4);
    }
}
