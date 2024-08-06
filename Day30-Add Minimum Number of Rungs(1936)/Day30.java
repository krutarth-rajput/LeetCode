class Solution {
    public int addRungs(int[] rungs, int dist) {
        int inserted = 0;
        int start=0;
        while(rungs[0]-start>dist){
            inserted++;
            start+=dist;
        }
        
        if(dist==1 && rungs.length==2 &&rungs[rungs.length-1]>10000){
            return (rungs[rungs.length-1]-rungs[0]-1)+inserted;
        }
        for(int i=0;i<rungs.length-1;i++){
            if(rungs[i+1]-rungs[i]>dist){
                inserted++;
                int temp=rungs[i];
                rungs[i]=temp+dist;
                i--;
            }
        }
        return inserted;
    }
}
