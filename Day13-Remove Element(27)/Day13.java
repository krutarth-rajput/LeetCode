class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<n;i++){
            if(nums[i]!=val){
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
