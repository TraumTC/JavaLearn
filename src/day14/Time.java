package day14;

public class Time <T> {
    private T value;

    public Time(T value) {
        this.value = value;
    }
    public Time() {}
    public T getValue() {
        return value;
    }
    public void setValue(T value) {
        this.value = value;
    }

}
