class Solution {
    public String kthDistinct(String[] arr, int k) {
        HashMap<String,Integer> hm = new HashMap<>();
        ArrayList<String> al=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(hm.containsKey(arr[i])==true){
                int temp=hm.get(arr[i]);
                hm.put(arr[i],temp+1);
            }else{
                hm.put(arr[i],1);
                al.add(arr[i]);
            }
        }
            int counter=0;
            for(String ele:al){
                System.out.print(ele);
                if(hm.get(ele)==1){
                    counter++;
                    if(counter==k){
                        return ele;
                    }
                }
            }
        return "";   
    }
}
