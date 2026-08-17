package Chapter07.ParameterValidationDemo;

public class ParameterValidationDemo {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.calculateAverage(100,4));

        //如果不在这里捕捉处理那么程序就会中断
        try {
            System.out.println(c.calculateAverage(100,0));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(c.calculateAverage(100,-1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
