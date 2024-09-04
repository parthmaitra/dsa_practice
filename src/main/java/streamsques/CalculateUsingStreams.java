package streamsques;

import java.util.Arrays;
import java.util.List;

public class CalculateUsingStreams {
    public static void main(String[] args) {
        List< Integer > nums = Arrays.asList(1, 3, 6, 8, 10, 18, 36);
        Double average = nums.stream()
                .mapToDouble(Integer::doubleValue)
                .average().orElse(Integer.MIN_VALUE);
        System.out.println(average);
    }
}
