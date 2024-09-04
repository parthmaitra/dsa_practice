package epam;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class KMostFrequent {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 4, 5, 2, 6, 1, 1};
        int N = arr.length;
        int K = 2;
        HashMap<Integer,Integer> count = new HashMap<>();
        Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                .entrySet().stream().sorted((a,b)-> Math.toIntExact(b.getValue() - a.getValue()))
                .limit(K)
                .forEach(integerLongEntry -> System.out.println(integerLongEntry.getKey()+":"+integerLongEntry.getValue()));
    }
}
