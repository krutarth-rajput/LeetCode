/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public void deleteNode(ListNode node) {
        ListNode current=node;
        ListNode ahead=node.next;
        while(ahead.next!=null){
            current.val=ahead.val;
            current=current.next;
            ahead=ahead.next;
        }
        current.val=ahead.val;
        current.next=null;
        
    }
}
