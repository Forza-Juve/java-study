package LambdaDemo01_Calculator;

@FunctionalInterface
public interface Calculator {
    int compute(int a,int b);
    public static void calculate(Calculator calculator,int a,int b){
        int result = calculator.compute(a,b);
        System.out.println("计算结果："+result);
    }
}
