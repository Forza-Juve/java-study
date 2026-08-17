package Chapter07.ParameterValidationDemo;

public class Calculator {
    public double calculateAverage(int total, int count){
        if(count <= 0){
            throw new IllegalArgumentException("非法参数，参数必须大于0，count = " + count);
        }
        double average = (double) total / count;
        return average;
    }
}
