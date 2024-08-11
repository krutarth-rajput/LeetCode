/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        traverse(al,root);
        for(int i=0;i<k;i++){
            pq.add(al.get(i));
        }
        for(int i=k;i<al.size();i++){
            
            if(al.get(i)<pq.peek()){
                pq.remove();
                pq.add(al.get(i));
                }
        }
        return pq.peek();        
    }
    public static void traverse(ArrayList<Integer> al,TreeNode root){
        
        if(root==null){
            return;
        }
        al.add(root.val);
        if(root.right!=null){traverse(al,root.right);}
        if(root.left!=null){traverse(al,root.left);}
    }
}
