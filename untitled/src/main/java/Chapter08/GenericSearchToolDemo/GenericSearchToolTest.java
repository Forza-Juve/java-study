package Chapter08.GenericSearchToolDemo;

public class GenericSearchToolTest {
    public static void main(String[] args) {
        int i1 = GenericSearchTool.indexOf(new String[]{"Java", "Git", "MySQL"},"Git");
        System.out.println(i1);

        int i2 = GenericSearchTool.indexOf(new String[]{"Java", "Git", "Java", "MySQL"},"Java");
        System.out.println(i2);

        int i3 = GenericSearchTool.indexOf(new Integer[]{11,22,33,44,33,22},22);
        System.out.println(i3);

        int i4 = GenericSearchTool.indexOf(new Integer[]{11,22,33,44,33,22},55);
        System.out.println(i4);

        int i5 = GenericSearchTool.indexOf(new String[]{"Java", null, "Git"},null);
        System.out.println(i5);
    }
}
