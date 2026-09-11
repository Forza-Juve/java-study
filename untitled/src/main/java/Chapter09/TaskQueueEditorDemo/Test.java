package Chapter09.TaskQueueEditorDemo;

import java.sql.SQLOutput;

public class Test {
    public static void main(String[] args) {
        //Test 1：添加
        TaskQueueEditor tqe = new TaskQueueEditor();
        tqe.addTask(new Task(1L,"A"));
        tqe.addTask(new Task(2L,"B"));
        tqe.addTask(new Task(3L,"C"));
        System.out.println(tqe.getTasks());
        //Test 2：中间插入
        if (tqe.insertBefore(2L,new Task(4L,"X"))) {
            System.out.println(tqe.getTasks());
        }
        //Test 3：删除
        if(tqe.removeTask(4L)){
            System.out.println(tqe.getTasks());
        }
        //Test 4：修改
        if(tqe.renameTask(2L,"B-Updated")){
            System.out.println(tqe.getTasks());
        }
        //Test 5：不存在的任务
        System.out.println(tqe.insertBefore(5L,new Task(6L,"F")));
        System.out.println(tqe.removeTask(7L));
        System.out.println(tqe.renameTask(9L,"null"));
        System.out.println(tqe.getTasks());
    }
}
