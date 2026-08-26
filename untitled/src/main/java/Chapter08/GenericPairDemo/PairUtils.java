package Chapter08.GenericPairDemo;

public class PairUtils {
    static <T> Pair<T> create(T first,T second){
        return new Pair<>(first,second);
    }

    static <T> Pair<T> copy(Pair<T> source){
        if(source == null){
            throw new RuntimeException("参数不能为null，source="+source);
        }
        return new Pair<>(source.getFirst(), source.getSecond());
    }
}
