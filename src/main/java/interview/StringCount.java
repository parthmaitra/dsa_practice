package interview;

import java.util.stream.Collectors;
import java.util.stream.Stream;

class StringCount {
    public static void main(String[] args) {
        String exampleString = "ParthPratimMaitra";
        Stream.of(exampleString.toLowerCase().split(""))
                .collect(Collectors.groupingBy(e->e,Collectors.counting()))
                .forEach((s, aLong) -> System.out.println(s+":"+aLong));
    }
}
