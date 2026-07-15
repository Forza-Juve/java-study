package LambdaDemo;

public class CalculatorTest {
    public static void main(String[] args) {
        //匿名内部类实现加法
        Calculator calculator = new Calculator() {
            @Override
            public int calculate(int a, int b) {
                return a + b;
            }
        };
        int sum = calculator.calculate(10,5);
        System.out.println(sum);

        //Lambda实现减法
        Calculator calculator1 = (int a,int b) -> a - b;
        int sub = calculator1.calculate(10,5);
        System.out.println(sub);

        //Lambda实现乘法
        Calculator calculator3 = (int a,int b) -> a * b;
        int mul = calculator3.calculate(10,5);
        System.out.println(mul);

        //Lambda实现求较大值
        Calculator calculator2 = (int a,int b) -> a > b ? a : b;
        int max = calculator2.calculate(10,5);
        System.out.println(max);

        //静态方法除法
        useCalculator(((int a,int b) -> a / b),10,5);

    }

    public static void useCalculator(Calculator calculator,int a,int b){
        System.out.println(calculator.calculate(a,b));

    }
}
