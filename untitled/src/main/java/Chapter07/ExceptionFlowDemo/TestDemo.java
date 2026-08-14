package Chapter07.ExceptionFlowDemo;

public class TestDemo {
    public static void main(String[] args) {
        ExceptionFlow.divide(20,5);
        ExceptionFlow.divide(20,0);
    }
}
/*
1.
如果没有catch：
divide(10,0)
程序会怎样？
答：会直接中断

2.
异常发生以后：
divide()
里面后面的代码还执行吗？
答：不会

3.
为什么这里适合捕获异常，而不是继续throws？
答：具体看业务需求，这里是将异常原因捕捉打印出来，所以没有throws给调用方

 */