package epam;

import java.util.HashSet;

public class TripletSumFinder {

    public static boolean
    find3Numbers(int[] A, int arr_size, int sum)
    {   for (int i = 0; i < arr_size - 2; i++) {
            HashSet<Integer> s = new HashSet<>();
            int curr_sum = sum - A[i];
            for (int j = i + 1; j < arr_size; j++) {
                int required_value = curr_sum - A[j];
                if (s.contains(required_value)) {
                    System.out.println("Triplet is " + A[i]
                            + ", " + A[j] + ", "
                            + required_value);
                    return true;
                }
                s.add(A[j]);
            }
        }
        return false;
    }
    public static void main(String[] args)
    {
        int[] A = { 1, 4, 45, 6, 10, 8 };
        int sum = 22;
        int arr_size = A.length;

        if (!find3Numbers(A, arr_size, sum)) {
            System.out.println(
                    "No triplet found with the given sum.");
        }
    }
}
