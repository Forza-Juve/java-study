package InterfaceDemo.SimpleCallbackDemo;

public class PrintTask implements Task{
    @Override
    public void execute() {
        System.out.println("执行打印任务");
    }
}
