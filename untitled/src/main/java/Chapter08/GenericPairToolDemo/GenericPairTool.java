package Chapter08.GenericPairToolDemo;

public class GenericPairTool {
    public static <T> Pair<T> createPair(T first, T second){
        return new Pair<T>(first,second);
    }
}
