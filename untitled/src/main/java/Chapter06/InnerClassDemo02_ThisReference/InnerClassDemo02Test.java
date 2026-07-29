package Chapter06.InnerClassDemo02_ThisReference;

public class InnerClassDemo02Test {
    public static void main(String[] args) {
        Outer outer = new Outer("外部类");
        Outer.Inner inner = outer.createInner("内部类");
        inner.showInner();
        inner.compareObject();
    }
}
