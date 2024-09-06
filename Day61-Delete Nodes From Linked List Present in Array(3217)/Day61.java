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
    public ListNode modifiedList(int[] nums, ListNode head) {
       HashSet<Integer> hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
        hs.add(nums[i]);
       }
       while(head.next!=null&&hs.contains(head.val)==true){
        head=head.next;
       }
       
       ListNode temp=head;
       while(temp.next!=null){
        int val=temp.next.val;
        
        if(hs.contains(val)==true){
            ListNode temp2=temp.next;
            if(temp2.next!=null){
                temp.next=temp2.next;
            }else{
                temp.next=null;
            }
        }else{
            temp=temp.next;
        }
       }
       return head; 
    }
}
