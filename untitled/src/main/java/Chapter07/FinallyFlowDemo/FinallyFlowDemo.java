package Chapter07.FinallyFlowDemo;

public class FinallyFlowDemo {
    public static void main(String[] args) {
        FinallyService fs = new FinallyService();
        fs.test(1);
        fs.test(2);
        fs.test(3);
    }
}
/*
为什么finally适合做资源清理？
finally里的代码都会执行

如果finally里面写return，会有什么问题？
会覆盖异常，返回return里的内容

try没有catch，只有finally，有什么作用？
主要用来关闭资源
 */