class Solution {
    public int maxVowels(String s, int k) {
       int n=s.length();
       int max=0;
       int len=0;
        for(int i=0;i<k;i++){
            if(isVowel(s.charAt(i))){
                len++; 
        }
        }
        max=Math.max(max,len);
       for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
               len--;
            }
            if(isVowel(s.charAt(i))){
               len++;
            }
            max=Math.max(max,len);
       }
       return max; 
    }
    public static boolean isVowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
}
