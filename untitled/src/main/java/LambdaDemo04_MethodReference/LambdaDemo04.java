package LambdaDemo04_MethodReference;

import LambdaDemo01_Calculator.Calculator;

public class LambdaDemo04 {
    public static void main(String[] args) {
        Calculator calculator1 = (a,b)-> LambdaDemo04_MethodReference.Calculator.add(a,b);
        int sum1 = calculator1.compute(10,20);
        System.out.println(sum1);

        Calculator calculator2 = LambdaDemo04_MethodReference.Calculator::add;
        int sum2 = calculator2.compute(10,20);
        System.out.println(sum2);

        Printer printer = new Printer();
        StringProcessor stringProcessor1 = text -> printer.print(text);
        stringProcessor1.process("Hello");

        StringProcessor stringProcessor2 = printer::print;
        stringProcessor2.process("Hello");

        StringProcessor stringProcessor3 = String::toUpperCase;
        String hello = stringProcessor3.process("Hello");
        System.out.println(hello);
    }
}
