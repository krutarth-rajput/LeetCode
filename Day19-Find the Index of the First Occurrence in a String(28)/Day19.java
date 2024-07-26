class Solution {
    public int strStr(String haystack, String needle) {
        int count=0;
        int ans=Integer.MIN_VALUE;
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                ans=i;
                int len=i+needle.length()-1;
                if(len>=haystack.length()){
                    break;
                }
                String compare=haystack.substring(i,i+needle.length());
                boolean t=compare.equals(needle);
                if(t){
                    return ans;
                }
            }
        }
        return -1;
    }
}
