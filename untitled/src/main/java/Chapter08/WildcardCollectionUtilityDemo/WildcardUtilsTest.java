package Chapter08.WildcardCollectionUtilityDemo;

public class WildcardUtilsTest {
    public static void main(String[] args) {
        NumberBox<Integer> integerNumberBox = new NumberBox<>(0);
        NumberBox<Double> doubleNumberBox = new NumberBox<>(0.1);
        System.out.println(integerNumberBox.getValue());
        System.out.println(doubleNumberBox.getValue());

        NumberBox<Integer> integerNumberBox1 = new NumberBox<>(1);
        NumberBox<Number> numberNumberBox = new NumberBox<>(20);
        NumberBox<Object> objectNumberBox = new NumberBox<>(new Object());
        WildcardUtils.setValue(integerNumberBox1,2);
        WildcardUtils.setValue(numberNumberBox,30);
        WildcardUtils.setValue(objectNumberBox,100);

        /*
        Test 3：故意制造编译错误

准备：

NumberBox<? extends Number>

尝试向其中设置一个 Integer。

观察 IDEA 的编译错误，并解释为什么不能这样做。

看不懂这个测试的意思，什么叫往一个参数是NumberBox的方法里放一个Integer
         */

        /*
        NumberBox<Integer> 可以
NumberBox<Double> 可以
NumberBox<Number> 可以
NumberBox<Object> 不行
NumberBox<String> 不行
         */
    }
}
