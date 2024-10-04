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
class Solution {
    public void reorderList(ListNode head) {
        ListNode f=head;
        ListNode s=head;
        while(f.next!=null&&f.next.next!=null){
            f=f.next.next;
            s=s.next;
        }
        ListNode current=s.next;
        s.next=null;
        ListNode previous=null;
        while(current!=null){
            ListNode ahead=current.next;
            current.next=previous;
            previous=current;
            current=ahead;
        }
        ListNode left=head;
        ListNode right=previous;
        while(right!=null){
            ListNode temp=left.next;
            ListNode temp2=right.next;
            left.next=right;
            right.next=temp;
            left=temp;;
            right=temp2;
        }
        
    }
}
