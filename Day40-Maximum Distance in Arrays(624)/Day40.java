class Solution {
    public int maxDistance(List<List<Integer>> arrays) {
        int[] max=new int[arrays.size()];
        int[] min=new int[arrays.size()];
        for(int i=0;i<arrays.size();i++){
            int mini=Integer.MAX_VALUE;
            int maxi=Integer.MIN_VALUE;
            List<Integer> n=arrays.get(i);
            for(int j=0;j<n.size();j++){
                if(n.get(j)>maxi){
                    maxi=n.get(j);
                }
                if(n.get(j)<mini){
                    mini=n.get(j);
                }
            }
            max[i]=maxi;
            min[i]=mini;
        }
        int lowest=Integer.MAX_VALUE;
        int highest=Integer.MIN_VALUE;
        
        int index=0;
        
        
        for(int i=0;i<max.length;i++){
            if(max[i]>highest){
                highest=max[i];
                index=i;
            }
        }
        int val=min[index];
        min[index]=Integer.MAX_VALUE;
        for(int i=0;i<min.length;i++){
            if(min[i]<lowest){
                lowest=min[i];
            }
        }
        int ans=highest-lowest;
        min[index]=val;
        //
        int lowest2=Integer.MAX_VALUE;
        int highest2=Integer.MIN_VALUE;

        int index2=0; 
        for(int i=0;i<min.length;i++){
            if(min[i]<lowest2){
                lowest2=min[i];
                index2=i;
            }
        }

        max[index2]=Integer.MIN_VALUE;
         for(int i=0;i<max.length;i++){
            if(max[i]>highest2){
                highest2=max[i];
            }
        }
        int ans2=highest2-lowest2;
        //System.out.println(index);
        System.out.println(ans);
        System.out.println(ans2);
        if(ans>ans2){
            return ans;
        }else{
            return ans2;
        }
        
    }
}
