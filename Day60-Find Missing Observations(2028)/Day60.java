class Solution {
    public int[] missingRolls(int[] rolls, int mean, int n) {
        int total=0;
        for(int i=0;i<rolls.length;i++){
            total=total+rolls[i];
        }
        int[] ans=new int[n];
        int num=rolls.length+n;
        int missingTotal=(num*mean)-total;
        //System.out.print(missingTotal);
        if(missingTotal>n*6){
            return new int[0];
        }else{
           if(missingTotal%n==0){
            int ele=missingTotal/n;
            for(int i=0;i<n;i++){
                ans[i]=ele;
            }
            }else{
                int subtract=0;
                while(missingTotal%n!=0&&missingTotal>0){
                    missingTotal--;
                    subtract++;
                }
                int ele=missingTotal/n;
                for(int i=0;i<n;i++){
                    ans[i]=ele;
                }
                int counter=0;
                for(int i=0;i<subtract;i++){
                    ans[counter]++;
                    counter++;
                    if(counter==n){
                        counter=0;
                    }
                }
            }
           }
           for(int i=0;i<ans.length;i++){
            if(ans[i]<1||ans[i]>6){
                return new int[0];
            }
           } 
        return ans;

    }
}
