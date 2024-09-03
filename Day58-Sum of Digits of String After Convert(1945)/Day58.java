class Solution {
    public int getLucky(String s, int k) {
        ArrayList<Integer> al=new ArrayList<>();
        
        
        for(int i=0;i<s.length();i++){
            al.add((int)s.charAt(i)-96);
        }
        long ans=0;
        for(int i=0;i<al.size();i++){
            int num=al.get(i);
            if(num<10){
                ans=ans+al.get(i);
            }else{
                while(num>0){
                    ans=ans+(num%10);
                    num=num/10;
                }
            }
            
        }
        if(k==1){
            return (int)ans;
        }
        
        for(int i=2;i<=k;i++){
            long count=0;
            while(ans>0){
                count=count+(ans%10);
                ans=ans/10;
            }
            //System.out.println(count);
            ans=count;
            if(i==k){
                return (int)ans;
            }
            
        }
        return (int)ans;
    }
}
