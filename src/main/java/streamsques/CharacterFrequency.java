package streamsques;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CharacterFrequency {
    public static void main(String[] args) {
        String name="ParthPratimMaitra";
        Map<String, Long> longMap = Stream.of(name.toLowerCase().split(""))
                .collect(Collectors
                        .groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(longMap);
    }
}
