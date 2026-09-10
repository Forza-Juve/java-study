package Chapter08.WildcardCollectionUtilityDemo;

public class NumberBox<T> {
    private T value;

    public NumberBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
