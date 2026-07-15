package MethodReferenceDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Flow;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class MethodReferenceTest {
    public static void main(String[] args) {
        //BiFunction<Integer,Integer,Integer> biFunction = (a,b)->Calculator.add(a,b);
        BiFunction<Integer,Integer,Integer> biFunction = Calculator::add;
        int sum = biFunction.apply(10,20);
        System.out.println(sum);

        StringPrinter printer = new StringPrinter();
        //Consumer<String> consumer = text -> printer.print(text);
        Consumer<String> consumer = printer::print;
        consumer.accept("Hello Method Reference");

        //banana
        //apple
        //orange
        //pear
        List<String> list = new ArrayList<>();
        list.add("banana");
        list.add("apple");
        list.add("orange");
        list.add("pear");

        //Collections.sort(list,(a,b) -> a.compareTo(b));
        list.sort(String::compareTo);
        System.out.println(list);
    }
}
