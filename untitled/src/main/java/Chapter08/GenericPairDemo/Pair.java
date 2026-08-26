package Chapter08.GenericPairDemo;

public class Pair<T> {
    private T first;
    private T second;

    public Pair(T first, T second) {
        if(first == null || second == null){
            throw new RuntimeException("参数不能为null，first=" + first + "，second=" + second);
        }
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public void setFirst(T first) {
        this.first = first;
    }

    public T getSecond() {
        return second;
    }

    public void setSecond(T second) {
        this.second = second;
    }

    public void swap(){
        T temp = first;
        first = second;
        second = temp;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "first=" + first +
                ", second=" + second +
                '}';
    }
}
