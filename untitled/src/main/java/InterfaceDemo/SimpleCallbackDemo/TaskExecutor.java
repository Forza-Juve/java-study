package InterfaceDemo.SimpleCallbackDemo;

public class TaskExecutor {

    public void run(Task task){
        System.out.println("Executor执行任务");
        task.execute();
    }

}
