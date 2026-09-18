package Chapter09.WordFrequencyCounterDemo;

import java.util.HashMap;
import java.util.Map;

public class WordFrequencyCounter {
    private Map<String,Integer> wordCounts = new HashMap<>();

    //方法一：添加一个单词
    public void addWord(String word){
        wordCounts.merge(word,1,Integer::sum);
    }

    //方法二：查询单词出现次数
    public int getCount(String word){
        return wordCounts.getOrDefault(word,0);
    }

    //方法三：获取所有统计结果
    public Map<String, Integer> getWordCounts(){
        return wordCounts;
    }
}
