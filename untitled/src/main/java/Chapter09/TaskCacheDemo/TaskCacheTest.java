package Chapter09.TaskCacheDemo;

public class TaskCacheTest {
    public static void main(String[] args) {
        TaskCache tc = new TaskCache();
        //测试 1：插入顺序
        tc.put(new Task("T1","A"));
        tc.put(new Task("T2","B"));
        tc.put(new Task("T3","C"));
        System.out.println(tc.getCachedTaskIds());
        //测试 2：访问顺序
        Task t1 = tc.get("T1");
        System.out.println(tc.getCachedTaskIds());
        Task t2 = tc.get("T2");
        System.out.println(tc.getCachedTaskIds());
        //测试 3：LRU 淘汰
        tc.put(new Task("T4","D"));
        System.out.println(tc.getCachedTaskIds());
        //测试 4：WeakHashMap
//        tc.putMetadata(new Task("1","A"),"A");
        //理论上这种“生命周期实验”没学的代码应该直接提供
//        try {
//            Thread.sleep(6000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(tc.getMetadata(new Task("1","A")));
        /*
        我对今天的Demo需求非常不满意
         */

        // 测试 4：WeakHashMap
        Task metadataTask = new Task("T5", "WeakHashMap Test");

        tc.putMetadata(metadataTask, "important");

        System.out.println(tc.getMetadata(metadataTask));

        metadataTask = null;

        System.gc();
    }
}
