package generics;

public class KafkaRecord <T extends Record>{
    private T value;

    public KafkaRecord(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "KafkaRecord{" +
                "value=" + value +
                '}';
    }
}
