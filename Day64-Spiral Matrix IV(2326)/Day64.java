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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] mat=new int[m][n];
        for(int[] arr:mat){
            Arrays.fill(arr,-1);
        }
        ListNode temp=head;
        int row=0;
        int col=0;
        int rsteps=m-1;
        int csteps=n-1;
        while(rsteps>=1&&csteps>=1&&temp!=null){
            for(int k=0;k<csteps;k++){
                mat[row][col]=temp.val;

                col++;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
            if(temp==null){
                    break;
                }
            for(int k=0;k<rsteps;k++){
                mat[row][col]=temp.val;
                row++;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
            if(temp==null){
                    break;
                }
            for(int k=0;k<csteps;k++){
                mat[row][col]=temp.val;
                col--;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
            if(temp==null){
                    break;
                }
            for(int k=0;k<rsteps;k++){
                mat[row][col]=temp.val;
                row--;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
            row++;
            col++;
            rsteps-=2;
            csteps-=2;
        }
        if(rsteps==0&&temp!=null){
            for(int k=0;k<csteps+1;k++){
                mat[row][col]=temp.val;
                col++;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
        }
        if(csteps==0&&temp!=null){
            for(int k=0;k<rsteps+1;k++){
                mat[row][col]=temp.val;
                row++;
                temp=temp.next;
                if(temp==null){
                    break;
                }
            }
        }
        return mat;
    }
}
