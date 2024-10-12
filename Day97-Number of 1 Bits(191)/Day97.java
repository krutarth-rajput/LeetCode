class Solution {
    public int hammingWeight(int n) {
       int count=0;
       for(int i=31;i>=0;i--){
        if(checkBit(n,i)==true){count++;}
       }
       return count; 
    }
    public static boolean checkBit(int n,int i){
        if((n&(1<<i))==0){return false;}
        else{return true;}
    }
}
