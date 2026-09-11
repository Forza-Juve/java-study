package Chapter09.TaskQueueEditorDemo;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public class TaskQueueEditor {
    private LinkedList<Task> tasks = new LinkedList<>();

    //① 添加任务到队尾
    public void addTask(Task task){
        tasks.add(tasks.size(),task);
    }

    //② 获取任务数量
    public int size(){
        return tasks.size();
    }

    //③ 在指定任务之前插入新任务
    public boolean insertBefore(Long taskId, Task newTask){
        ListIterator<Task> taskListIterator = tasks.listIterator();
        while(taskListIterator.hasNext()){
            Task task = taskListIterator.next();
            if (task.getId().equals(taskId)){
                taskListIterator.previous();
                taskListIterator.add(newTask);
                return true;
            }
        }
        return false;
    }

    //④ 删除指定任务
    public boolean removeTask(Long taskId){
        ListIterator<Task> taskListIterator = tasks.listIterator();
        while(taskListIterator.hasNext()){
            Task task = taskListIterator.next();
            if (task.getId().equals(taskId)){
                taskListIterator.remove();
                return true;
            }
        }
        return false;
    }

    //⑤ 修改指定任务标题
    public boolean renameTask(Long taskId, String newTitle){
        ListIterator<Task> taskListIterator = tasks.listIterator();
        while(taskListIterator.hasNext()){
            Task task = taskListIterator.next();
            if (task.getId().equals(taskId)){
                taskListIterator.set(new Task(taskId,newTitle));
                return true;
            }
        }
        return false;
    }

    //⑥ 获取所有任务
    public List<Task> getTasks(){
        return tasks;
    }


}
