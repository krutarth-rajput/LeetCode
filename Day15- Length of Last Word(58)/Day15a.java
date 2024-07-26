class Solution {
    public int lengthOfLastWord(String s) {
        int count=0;
        
        int i=s.length()-1;
        if(i==0){
            if(s.charAt(i)!=' '){
                return 1;
            }else{
                return 0;
            }
        }
        if(s.charAt(i)==' '){
            while(s.charAt(i)==' '){
                i--;
            }
        }
        while(s.charAt(i)!=' '){
            i--;
            count++;
            if(i<0){
                break;
            }
        }
        return count;
    }
}
