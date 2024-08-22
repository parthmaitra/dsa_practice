package general;

public class SumOfBSTInRange {
    public int rangeSumBST(TreeNode root, int low, int high) {
        int sum=0;
        if(root.val>=low&&root.val<=high){
            sum+=root.val;
        }
        if(root.right!=null){
            sum+=rangeSumBST(root.right,low,high);
        }
        if(root.left!=null){
            sum+=rangeSumBST(root.left,low,high);
        }
        return sum;
    }
}
