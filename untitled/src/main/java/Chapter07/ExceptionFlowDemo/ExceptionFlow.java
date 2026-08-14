package Chapter07.ExceptionFlowDemo;

public class ExceptionFlow {
    public static int divide(int a, int b){
        int divide = 0;
        try {
            System.out.println("开始计算");
            divide = a/b;
            System.out.println("计算结束");
        } catch (ArithmeticException e) {
            System.out.println("除数不能为0");
            System.out.println("异常类名："+e.getClass().getName());
            System.out.println("异常信息：" + e.getMessage());
        }
        return divide;
    }
}
