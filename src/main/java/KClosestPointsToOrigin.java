
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KClosestPointsToOrigin {
    public int[][] kClosest(int[][] points, int k) {
        PriorityQueue<int[]> pointsList = new PriorityQueue<>(Comparator.comparingInt(o -> (o[0] * o[0] + o[1] * o[1])));
        Collections.addAll(pointsList, points);
        int[][] ans =new int[k][2];
        for (int i = 0; i < k; i++) {
            ans[i]=pointsList.poll();
        }
        return ans;
    }

    public static void main(String[] args) {
        KClosestPointsToOrigin k = new KClosestPointsToOrigin();
        int[][] points = new int[][]{{1,3},{-2,2},{2,-2}};
        int[][] kClosest = k.kClosest(points,2);
        for (int[] values : kClosest) {
            for(int point:values) {
                System.out.print(point+" ");
            }
            System.out.println();
        }
    }
}
