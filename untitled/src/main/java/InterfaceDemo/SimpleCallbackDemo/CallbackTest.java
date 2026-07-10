package InterfaceDemo.SimpleCallbackDemo;

public class CallbackTest {
    public static void main(String[] args) {
        Task t1 = new PrintTask();
        Task t2 = new SaveTask();
        TaskExecutor te = new TaskExecutor();
        te.run(t1);
        te.run(t2);
    }
}
