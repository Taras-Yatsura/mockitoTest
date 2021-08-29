package generics;

import java.util.HashMap;
import java.util.Map;

public class TestGenerics {
    Map<Class<? extends Record>, SourceFunction<KafkaRecord<? extends Record>>> sources;

    public SourceFunction<KafkaRecord<Interaction>> getSource() {
        return new SourceFunction<>();
    }


    public static void main(String[] args) {
        TestGenerics test = new TestGenerics();
        test.sources = new HashMap<>();
        test.sources.put(Interaction.class, test.getSource());
    }

}
