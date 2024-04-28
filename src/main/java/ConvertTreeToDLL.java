import java.util.Arrays;
import java.util.List;

public class ConvertTreeToDLL {
    TreeNode root =null;
    TreeNode head=null;
    public static void main(String[] args) {
        List<Integer> nodes = Arrays.asList(4,2,6,3,5,1,7);
        ConvertTreeToDLL cttd = new ConvertTreeToDLL();
        for (Integer val:nodes){
            cttd.root=cttd.insertInBST(cttd.root,val);
        }
        cttd.print(cttd.root);
        System.out.println();
        cttd.convert(cttd.root);
        cttd.printLL(cttd.head);
    }
    private void print(TreeNode head) {
        if(head.right!=null)
            print(head.right);
        System.out.print(head.val);
        if (head.left!=null)
            print(head.left);

    }
    private  void printLL(TreeNode head) {
        TreeNode curr = head;
        while(curr!=null) {
            System.out.print(curr.val);
            curr=curr.right;
        }
        System.out.println();
    }
    private void convert(TreeNode curr) {
        TreeNode right = curr.right;
        TreeNode left = curr.left;
        if(right!=null)
            convert(right);
        if(head==null) {
            head = curr;
            head.left=null;
            head.right=null;
        }
        else {
            curr.right=head;
            curr.left=null;
            head.left=curr;
            head=curr;
        }
        if (left!=null)
            convert(left);
    }
    /*public TreeNode convertTreeToDLL(TreeNode head, TreeNode next,TreeNode prev) {
        if(head.left == null && head.right == null) {

        }
        else {

        }
        return head;
    }*/
    private TreeNode insertInBST(TreeNode head, int val) {
        if(head==null) {
            head = new TreeNode(val);
        }
        else {
            if(head.val<val) {
                head.right=insertInBST(head.right,val);
            }
            else {
                head.left=insertInBST(head.left,val);
            }
        }
        return head;
    }
}

