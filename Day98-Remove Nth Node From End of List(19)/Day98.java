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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(n==1){
            if(head.next==null){return null;}
            else{
            System.out.print("if");
            ListNode temp=head;
            while(temp.next!=null&&temp.next.next!=null){
                temp=temp.next;
            }
            temp.next=null;
            return head;
            }
        }else{
            System.out.print("else");
        ListNode temp=head;
        temp = rotate(temp);
        ListNode temp2=temp;
        for(int i=1;i<n-1;i++){
            temp2=temp2.next;
        }
        if(temp2.next!=null&&temp2.next.next!=null){temp2.next=temp2.next.next;}
        else{temp2.next=null;}
        head=rotate(temp);
        return head;       
    }
    }
    public static ListNode rotate(ListNode head){
        ListNode curr=head;
        ListNode prev=null;
        while(curr!=null){
            ListNode currP1=curr.next;
            curr.next=prev;
            prev=curr;
            curr=currP1;
        }
        return prev;
    }
}
