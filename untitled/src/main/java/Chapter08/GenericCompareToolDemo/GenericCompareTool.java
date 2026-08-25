package Chapter08.GenericCompareToolDemo;

public class GenericCompareTool {
    public static <T extends Comparable> T max(T first, T second){
        if(first.compareTo(second) > 0){
            return first;
        }else if(first.compareTo(second) < 0){
            return second;
        }
        return first;
    }
}
