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
    public ListNode mergeInBetween(ListNode list1, int a, int b, ListNode list2) {
        ListNode join=list1;
        int count=0;
        while(count!=b){
            join=join.next;
            count++;
        }
        join=join.next;
        count=0;
        ListNode counter=list1;
        while(count<a-1){
            counter=counter.next;
            count++;
        }
        counter.next=list2;
        counter=list2;
        while(counter.next!=null){
            counter=counter.next;
        }
        counter.next=join;
        return list1;

    }
}
