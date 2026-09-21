package Chapter09.TaskScoreMapDemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TaskScoreManagerTest {
    public static void main(String[] args) {
        //测试 1：添加任务
        TaskScoreManager tsm = new TaskScoreManager();
        tsm.addScore("java",90);
        tsm.addScore("mysql",85);
        tsm.addScore("spring",92);
        System.out.println(tsm.getTaskNames());
        //测试 2：通过 keySet 视图删除任务
        Set<String> taskNames = tsm.getTaskNames();
        taskNames.remove("mysql");
        System.out.println(tsm.getTaskEntries());
        //测试 3：通过 entrySet 获取 key 和 value
        Set<Map.Entry<String, Integer>> taskEntries = tsm.getTaskEntries();
        for(Map.Entry<String,Integer> entry : taskEntries){
            System.out.print(entry.getKey()+"=");
            System.out.println(entry.getValue());
        }
        //测试 4：通过 Map.Entry.setValue() 修改分数
        for (Map.Entry<String,Integer> entry : taskEntries){
            if("java".equals(entry.getKey())){
                entry.setValue(95);
            }
        }
        System.out.println(tsm.getTaskEntries());

//        Map<String,Integer> scores = new HashMap<>();
//        scores.put("java",90);
//        scores.put("mysql",0);
//        scores.put("spring",0);
//
//        for(Map.Entry<String,Integer> score: scores.entrySet()){
//            if(score.getValue() == 0){
//                score.getValue().
//            }
//        }
//
//        System.out.println(scores);
    }
}
