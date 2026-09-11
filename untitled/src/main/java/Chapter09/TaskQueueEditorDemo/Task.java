package Chapter09.TaskQueueEditorDemo;

public class Task {
    //id 唯一，太麻烦了，而且和Demo主题关系不大，这里就不实现了
    private Long id;
    //title 不允许为空 这种需求我觉得没意义，浪费时间
    private String title;


    public Task(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
