package Chapter09.TaskCollectionManagerDemo;

import java.util.*;

public class TaskManagerTest {
    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>();
        Set<String> tags = new HashSet<>();
        Set<Integer> priorities = new TreeSet<>(Integer::compareTo);
        TaskManager tm = new TaskManager(tasks,tags,priorities);
        //测试 1：ArrayList 允许重复
        Task t1 = new Task("Learn Java",1);
        Task t2 = new Task("Learn Java",1);
        tm.addTask(t1);
        tm.addTask(t2);
        //任务数量 = 2，这个数据从哪来？这里直接用tasks.size方法
        System.out.println("任务数量 = " + tasks.size());
        //测试 2：ArrayList 按索引访问
        Task t3 = new Task("Learn Java1",2);
        tm.addTask(t3);
        System.out.println(tm.getTask(2));
        //测试 3：HashSet 去重
        tm.addTag("Java");
        tm.addTag("Java");
        tm.addTag("MySql");
        tm.addTag("Spring");
        tm.addTag("Spring");
        System.out.println(tags.size());
        System.out.println(tm.containsTag("Java"));
        System.out.println(tm.containsTag("Docker"));
        //测试 4：TreeSet 自动排序
        tm.addPriority(5);
        tm.addPriority(1);
        tm.addPriority(3);
        tm.addPriority(5);
        tm.addPriority(2);
        tm.addPriority(1);
        for(Integer i : tm.getPriorities()){
            System.out.println(i);
        }

    }
}
/*
为什么 tasks 使用 List？
任务可能有重复的
为什么 tags 使用 HashSet？
重复标签没有意义
为什么 priorities 使用 TreeSet？
优先级需要排序
为什么两个相同 Task 加入 tasks 后有两个？
List允许相同元素
为什么两个相同优先级加入 priorities 后只有一个？
Set不允许相同元素
 */