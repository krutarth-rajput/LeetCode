class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
      HashSet<Character> hs=new HashSet<>();
      for(int i=0;i<allowed.length();i++){
        hs.add(allowed.charAt(i));
      }
      int count=0;
      for(int i=0;i<words.length;i++){
        String s=words[i];
        int flip=0;
        for(int k=0;k<s.length();k++){
            
            if(hs.contains(s.charAt(k))==false){
                flip=1;
                break;
            }
        }
        if(flip==0){count++;}
      }
      return count;  
    }
}
