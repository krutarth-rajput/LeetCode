class Solution {
    public int reverse(int x) {
        long revx=0;
        while(x!=0){
        revx=revx*10+(x%10);
        x=x/10;
        }
        if(revx>Integer.MIN_VALUE && revx<=Integer.MAX_VALUE){ 
            return (int)revx;
        }else{
            return 0;
        }
        
    }
}
