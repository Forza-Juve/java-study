package AnonymousInnerClassCallbackDemo;

public class TaskExecutor {
    public void execute(TaskListener listener){
        System.out.println("任务开始执行");

        listener.onComplete("任务执行成功");
    }
}
