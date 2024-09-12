class Solution {
    public int[][] merge(int[][] intervals) {
       ArrayList<int[]> al=new ArrayList<>();
       Arrays.sort(intervals,(a,b)->
        Integer.compare(a[0],b[0])
       );
       int n=intervals.length;
       int counter=0;
       al.add(intervals[0]);
       for(int i=1;i<n;i++){
          int[] arr2=intervals[i];
          int[] arr1=al.get(counter);
          if(arr1[1]>=arr2[0]){
            al.remove(counter);
            int[] ans=new int[2];
            if(arr1[0]<arr2[0]){
                ans[0]=arr1[0];
            }else{
                ans[0]=arr2[0];
            }
            if(arr1[1]>arr2[1]){
                ans[1]=arr1[1];
            }else{
                ans[1]=arr2[1];
            }
            al.add(ans);
          }else{
            al.add(intervals[i]);
            counter++;
          }
       }
       int[][] sub=new int[al.size()][2];
       for(int i=0;i<al.size();i++){
        sub[i]=al.get(i);
       }
       return sub;
        
    }
}
