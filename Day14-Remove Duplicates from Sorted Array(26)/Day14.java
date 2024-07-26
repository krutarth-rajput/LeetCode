class Solution {
    public int removeDuplicates(int[] nums) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(st.size()==0||st.peek()!=nums[i]){
                st.push(nums[i]);
            }
        }
        int arr=st.size();
       for(int i=st.size()-1;i>=0;i--){
            nums[i]=st.pop();
            
        }
        return arr;
    }
}
