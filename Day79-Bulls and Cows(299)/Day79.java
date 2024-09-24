class Solution {
    public String getHint(String secret, String guess) {
        int bull=0;
        int cow=0;
        HashMap<Character,Integer> s=new HashMap<>();
        
        for(int i=0;i<secret.length();i++){
            if(s.containsKey(secret.charAt(i))==true){
                int temp=s.get(secret.charAt(i));
                s.put(secret.charAt(i),temp+1);
            }else{
                s.put(secret.charAt(i),1);
            }
        }
        for(int i=0;i<secret.length();i++){
            if(s.containsKey(guess.charAt(i))==true){
                if(s.get(guess.charAt(i))>0){
                    int temp=s.get(guess.charAt(i));
                    cow++;
                    s.put(guess.charAt(i),temp-1);
                }
            }
        }
        for(int i=0;i<guess.length();i++){
            if(guess.charAt(i)==secret.charAt(i)){
                cow--;
                bull++;
            }
        }
        return bull+"A"+cow+"B";


    }
}
