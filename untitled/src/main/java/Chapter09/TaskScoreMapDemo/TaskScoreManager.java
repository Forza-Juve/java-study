package Chapter09.TaskScoreMapDemo;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskScoreManager {
    private Map<String, Integer> scores;

    public TaskScoreManager() {
        this.scores = new HashMap<>();
    }

    //① 添加或更新任务分数
    public void addScore(String taskName, int score){
        scores.put(taskName,score);
    }

    //② 获取所有任务名称
    public Set<String> getTaskNames(){
        return scores.keySet();
    }

    //③ 获取所有分数
    public Collection<Integer> getScores(){
        return scores.values();
    }

    //④ 获取所有任务及分数
    public Set<Map.Entry<String, Integer>> getTaskEntries(){
        return scores.entrySet();
    }
}
