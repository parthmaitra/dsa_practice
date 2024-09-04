package streamsques;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ConcatIntStream {
    public static void main(String[] args) {
        int [] randomNumbers ={12, 32, 2, 4, 777, 5, 32, 890, 422, 44, 99, 43};
        int [] randomNumber2 = {4, 3, 2, 5, 6, 78, 98, 53, 90};
        IntStream.concat(Arrays.stream(randomNumbers)
                        ,Arrays.stream(randomNumber2))
                .distinct().sorted()
                .forEach(System.out::println);

    }
}
