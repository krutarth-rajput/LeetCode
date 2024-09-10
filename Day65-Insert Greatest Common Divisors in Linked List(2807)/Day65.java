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
    public ListNode insertGreatestCommonDivisors(ListNode head) {
        ListNode prev=head;
        ListNode successor=head.next;
        while(successor!=null){
            int num1=prev.val;
            int num2=successor.val;
            int value=gcd(num1,num2);
            ListNode temp=new ListNode(value);
            prev.next=temp;
            temp.next=successor;
            prev=prev.next.next;
            successor=successor.next;
        }
        return head;
        
    }
    public static int gcd(int a,int b){
        a=Math.abs(a);
        b=Math.abs(b);
        if(a==0){return b;}
        int temp=gcd(b%a,a);
        return temp;
    }
}
