package epam;

import java.util.HashMap;

public class KMostFrequent {
    public static void main(String[] args) {
        int arr[] = {3, 1, 4, 4, 5, 2, 6, 1,1};
        int N = arr.length;
        int K = 2;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }
        map.entrySet().stream().sorted((a, b) -> b.getValue() - a.getValue()).limit(K).forEach(System.out::println);
    }
}
