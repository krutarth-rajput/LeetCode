import java.util.*;
class Solution {
    public int maxProfitAssignment(int[] difficulty, int[] profit, int[] worker) {
        int maxProfit=0;
        for(int j=0;j<worker.length;j++){
            int index=Integer.MIN_VALUE;
            int count=0;
            for(int i=0;i<difficulty.length;i++){
                if(worker[j]>=difficulty[i]){
                  if(count==0){
                    index=i;
                    count+=1;
                  }
                  else if(profit[i]>profit[index]){
                    index=i;
                  }
                }
            }
            if(index==0){
                if(worker[j]>=difficulty[index]){
                    maxProfit=maxProfit+profit[index];
                }
            }else if(index>0){
                maxProfit=maxProfit+profit[index];
            }
            
        }
        
        return maxProfit; 
    }
}
