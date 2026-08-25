package Chapter08.GenericPairToolDemo;

public class GenericPairToolTest {
    public static void main(String[] args) {
        Pair<String> pair1 = GenericPairTool.createPair("Java", "Generic");
        System.out.println(pair1);

        Pair<Integer> pair2 = GenericPairTool.createPair(100, 200);
        System.out.println(pair2);

        Pair<String> pair3 = new Pair<>("A","B");
        System.out.println(pair3);
        pair3.setFirst("C");
        pair3.setSecond("D");
        System.out.println(pair3);
    }
}
