package general;

public class GroupReverseLinkedList {

    public static void main(String[] args) {
        ListNode head=null;
        GroupReverseLinkedList grll = new GroupReverseLinkedList();
        for(int i=6;i>=1;i--) {
            if(head==null) {
                head=new ListNode(i);
            }
            else {
                ListNode newNode = new ListNode(i);
                newNode.next=head;
                head=newNode;
            }
        }
        grll.printList(head);
        head=grll.reverse(head,3);
        grll.printList(head);

    }
    void printList(ListNode head) {
        ListNode curr = head;
        while(curr!=null){
            System.out.print(curr.val);
            if(curr.next!=null){
                System.out.print("-->");
            }
            curr=curr.next;
        }
        System.out.println();
    }
    public ListNode reverse(ListNode head,int k) {
        int count=0;
        if(head==null)
            return null;
        ListNode curr = head;
        ListNode next = null;
        ListNode prev = null;
        while(count<k&& curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
            count++;
        }
        if(next!=null) {
            head.next=reverse(next,k);
        }
        return prev;
    }
}
class ListNode {
    int val;
    ListNode next=null;
    ListNode(int val) {
        this.val = val;
    }
}