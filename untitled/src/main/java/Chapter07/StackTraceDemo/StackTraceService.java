package Chapter07.StackTraceDemo;

public class StackTraceService {
    public void levelOne(){
        levelTwo();
    }
    public void levelTwo(){
        levelThree();
    }
    public void levelThree(){
        throw new RuntimeException("测试异常");
    }
}
