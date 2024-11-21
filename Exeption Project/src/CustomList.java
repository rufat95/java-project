public class CustomList <T> {
    T value;

    public CustomList() {}

    public CustomList(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
