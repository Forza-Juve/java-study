package Chapter09.PriorityTaskQueueDemo;

public class PriorityTaskQueueTest {
    public static void main(String[] args) {

        TaskQueueManager tqm = new TaskQueueManager();
        Task t1 = new Task("Backup Database", 3);
        Task t2 = new Task("Fix Payment Error", 1);
        Task t3 = new Task("Send Report", 2);

        tqm.addTask(t1);
        tqm.addTask(t2);
        tqm.addTask(t3);

        System.out.println(tqm.pollPriorityTask().getPriority());
        System.out.println(tqm.pollPriorityTask().getPriority());
        System.out.println(tqm.pollPriorityTask().getPriority());

        tqm.recordTask(t1);
        tqm.recordTask(t2);
        tqm.recordTask(t3);//Send Report

        System.out.println(tqm.pollLatestHistory());
        System.out.println(tqm.pollLatestHistory());
        System.out.println(tqm.pollLatestHistory());

        tqm.addTask(t1);
        tqm.addTask(t2);
        tqm.addTask(t3);
        System.out.println(tqm.peekPriorityTask());

        TaskQueueManager tqm1 = new TaskQueueManager();
        System.out.println(tqm1.pollTask());
        System.out.println(tqm1.pollPriorityTask());
        System.out.println(tqm1.pollLatestHistory());
        System.out.println(tqm1.peekPriorityTask());
    }
}
