package InterfaceDemo.SimpleCallbackDemo;

public class SaveTask implements Task{
    @Override
    public void execute() {
        System.out.println("执行保存任务");
    }
}
