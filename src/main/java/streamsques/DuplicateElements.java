package streamsques;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateElements {
    public static void main(String[] args) {
        List<Integer> integers = Arrays
                .asList(1,2,2,4,7,6,7,8,9,1);
        HashSet<Integer> uniqueNums = new HashSet<>();
        integers.stream()
                .distinct()
                .collect(Collectors.toList())
                .forEach(System.out::println);
    }
}
