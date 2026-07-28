package AnonymousInnerClassCallbackDemo;

public class DemoTest {
    public static void main(String[] args) {
        TaskExecutor executor = new TaskExecutor();
        executor.execute(new TaskListener() {
            @Override
            public void onComplete(String result) {
                System.out.println("收到通知："+result);
            }
        });
        //System.out.println("收到通知：任务执行成功");
    }
}
