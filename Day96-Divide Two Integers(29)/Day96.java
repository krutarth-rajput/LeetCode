class Solution {
    public int divide(int dividend, int divisor) {
        int sign=1;
        if(divisor<0){sign=sign*-1;}
        if(dividend<0){sign=sign*-1;}
        long a=dividend;
        long b=divisor;
        a=Math.abs(a);
        b=Math.abs(b);
        long ans=0;
        long temp=0;
        for(int x=31;x>=0;x--){
            if ((temp+(b<<x))<=a){
                ans+=((long)1<<x);
                temp+=b<<x;
            }
        }  

        if(sign<0){
            ans=-ans;
        }
        if(ans>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }else if(ans<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }else{
            return (int)ans;
        }       
    }
}

