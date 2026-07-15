package LambdaDemo01_Calculator;

public class LambdaDemo01 {
    public static void main(String[] args) {
        //加法 参数类型全部写出。
        Calculator sumCompute = (int a,int b) -> {return a + b;};
        int sum = sumCompute.compute(10 ,5);
        System.out.println("加法结果：" + sum);
        //减法 省略参数类型。
        Calculator subCompute = (a,b) -> {return a - b;};
        int sub = subCompute.compute(10,5);
        System.out.println("减法结果："+sub);
        //乘法 使用 {} 和 return
        Calculator mulCompute = (a,b) -> a * b;
        int mul = mulCompute.compute(10,5);
        System.out.println("乘法结果："+mul);
        //最大值
        Calculator maxCompute = (a,b) -> a > b ? a : b;
        int max = maxCompute.compute(10,5);
        System.out.println("最大值："+max);

        //让 Lambda 作为参数传入
        Calculator.calculate((a,b)-> a + b,10,5);
    }
}
