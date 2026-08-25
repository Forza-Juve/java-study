package Chapter08.GenericMinMaxToolDemo;

import Chapter08.GenericPairToolDemo.Pair;

public class GenericMinMaxTool {
    public static <T extends Comparable> Pair<T> minmax(T[] array){
        if(array == null || array.length == 0){
            return null;
        }
        T min = array[0];
        T max = array[0];
        for (int i = 0; i < array.length; i++) {
            if(min.compareTo(array[i]) > 0)
                min = array[i];
            if(max.compareTo(array[i]) < 0){
                max = array[i];
            }
        }
        return new Pair<>(min,max);
    }
}
