class Solution {
    public int passThePillow(int n, int time) {
        int a=0;
        int ans=0;
        while(time!=0){
            if(a==0){
                int i=1;
                while(i<=n){
                    i++; 
                    time--;
                    if(time==0){
                        ans=i;
                        break;
                    }
                    if(i==n){
                        a=1;
                        break;
                    }
                }
            }
            else if(a==1){
                int i=n;
                while(i>1){
                    i--;
                    time--;
                    if(time==0){
                        ans=i;
                        break;
                    }
                    if(i==1){
                        a=0;
                        break;
                    }
                }
            }
        }
        return ans;
    }
}
