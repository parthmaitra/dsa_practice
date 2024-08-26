package epam;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamsPractice {
    public static void main(String[] args) {
        String input =  "asdfaghjklkjhgfdsa";
        HashSet<String> characters = new HashSet<>();
        Arrays.stream(input.split("")).filter(e->!characters.add(e)).findFirst().ifPresent(System.out::println);
    }
}
