package general;

import java.util.*;

public class TwoSum {
    public List<int[]> pairSum(int[] arr, int s) {
        List<int[]> ans = new ArrayList<>();
        HashMap<Integer,Integer> diff = new HashMap<>();
        int curr;
        for(int i=0;i<arr.length;i++){
            curr=s-arr[i];
            if(diff.get(arr[i])!=null){
                int [] match = new int[]{arr[i],curr};
                ans.add(match);
            }
            diff.put(curr,i);
        }
        return ans;
    }
}
