package Chapter08.GenericCompareToolDemo;

public class GenericCompareToolTest {
    public static void main(String[] args) {
        Integer i1 = GenericCompareTool.max(10, 20);
        System.out.println(i1);
        String i2 = GenericCompareTool.max("Java", "Git");
        System.out.println(i2);
        Integer i3 = GenericCompareTool.max(30, 30);
        System.out.println(i3);
    }
}
