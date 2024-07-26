class Solution {
    public List<String> buildArray(int[] target, int n) {
        int count=target.length;
        int counter=0;
        ArrayList<String> al=new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i==target[counter]){
                count--;
                counter++;
                al.add("Push");
            }else{
                al.add("Push");
                al.add("Pop");
            }
            if(count==0){
                break;
            }
        }
        return al;
    }
}
