package epam;

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class RotateListKTimes {
    public ListNode rotateRight(ListNode head, int k) {
        ListNode slow=head,fast=head;
        int size=0;
        if(head==null){
            return null;
        }
        while(fast!=null){
            size++;
            fast=fast.next;
        }
        k=k%size;
        fast=head;
        for(int i=0;i<k;i++){
            fast=fast.next;
        }
        while(fast.next!=null){
            slow=slow.next;
            fast=fast.next;
        }
        fast.next = head;
        head = slow.next;
        slow.next=null;
        return head;
    }
}
