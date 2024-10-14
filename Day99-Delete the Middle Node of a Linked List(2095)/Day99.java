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
    public ListNode deleteMiddle(ListNode head) {
        if(head.next==null){return null;}
        if(head.next.next==null){
            head.next=null;
            return head;
        }
       ListNode f=head;
       ListNode s=head;
       while(f.next!=null&&f.next.next!=null){
        f=f.next.next;
        s=s.next;
        if(f.next!=null&&f.next.next==null){
            s=s.next;
        }
       }
       ListNode middle=s;
       while(middle.next.next!=null){
        int temp=middle.val;
        middle.val=middle.next.val;
        middle.next.val=temp;
        middle=middle.next;
       }
       middle.val=middle.next.val;
       middle.next=null;
       return head;


    }
}
