class Solution {
    public boolean canBeEqual(int[] target, int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();
        for(int i=0;i<target.length;i++){
            if(hm.containsKey(target[i])==true){
                int temp=hm.get(target[i]);
                hm.put(target[i],temp+1);
            }else{
                hm.put(target[i],1);
            }
        }
        for(int i=0;i<arr.length;i++){
            if(hm2.containsKey(arr[i])==true){
                int temp=hm2.get(arr[i]);
                hm2.put(arr[i],temp+1);
            }else{
                hm2.put(arr[i],1);
            }
        }
            for(int i=0;i<target.length;i++){
                if(hm.containsKey(target[i])==true &&hm2.containsKey(target[i])!=true){
                    return false;
                }
                if(hm.containsKey(target[i])==true &&hm2.containsKey(target[i])==true){
                    if(hm.get(target[i])!=hm2.get(target[i])){
                        return false;
                    }
                }
            }
            return true;
    }
}
