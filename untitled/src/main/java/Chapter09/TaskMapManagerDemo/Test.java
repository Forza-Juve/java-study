package Chapter09.TaskMapManagerDemo;

public class Test {
    public static void main(String[] args) {
        TaskMapManager tmm = new TaskMapManager();
//        tmm.addTask(new Task(1L,"A"));
//        tmm.addTask(new Task(2L,"B"));
//        tmm.addTask(new Task(3L,"C"));
//
//        System.out.println(tmm.size());
//
//        System.out.println(tmm.findTask(1L));
//        System.out.println(tmm.findTask(4L));
//
//        System.out.println(tmm.findTaskOrDefault(4L,new Task(5L,"E")));
//
//        tmm.addTask(new Task(1001L,"A"));
//        tmm.addTask(new Task(1001L,"B"));
//        System.out.println(tmm.findTask(1001L));
//
//        System.out.println(tmm.removeTask(1001L));
//        System.out.println(tmm.size());
//        System.out.println(tmm.containsTask(1001L));
//        System.out.println(tmm.findTask(1001L));
//
//        tmm.printAllTasks();

        tmm.addTask(new Task(30, "C"));
        tmm.addTask(new Task(10, "A"));
        tmm.addTask(new Task(20, "B"));

        tmm.printAllTasks();

        tmm.addTask(new Task(20, "B2"));

        System.out.println(tmm.findTask(20));
    }
}
