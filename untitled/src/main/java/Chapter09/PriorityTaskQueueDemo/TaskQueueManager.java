package Chapter09.PriorityTaskQueueDemo;

import java.util.*;

public class TaskQueueManager {
    private Queue<Task> taskQueue = new ArrayDeque<>();

    private Deque<Task> taskHistory = new ArrayDeque<>();

    private PriorityQueue<Task> priorityQueue = new PriorityQueue<>(Comparator.comparing(Task::getPriority));

    public TaskQueueManager() {
    }

    public void addTask(Task task){
        taskQueue.offer(task);
        priorityQueue.offer(task);
    }

    public Task pollTask(){
        return taskQueue.poll();
    }

    public Task pollPriorityTask(){
        return priorityQueue.poll();
    }

    public void recordTask(Task task){
        //System.out.println(taskHistory.offerFirst(task));
        taskHistory.offerFirst(task);
    }

    public Task pollLatestHistory(){
        return taskHistory.pollFirst();
    }

    public Task peekPriorityTask(){
        return priorityQueue.peek();
    }
}
