class Solution {
    public int romanToInt(String s) {
        int ans=0;
        HashMap<Character,Integer> hm=new HashMap<>();
        char[] arr=s.toCharArray();
        hm.put('I',1);
        hm.put('V',5);
        hm.put('X',10);
        hm.put('L',50);
        hm.put('C',100);
        hm.put('D',500);
        hm.put('M',1000);
        for(int i=0;i<arr.length-1;i++){
            if(hm.get(arr[i])<hm.get(arr[i+1])){
                ans=ans-hm.get(arr[i]);
            }else{
                ans=ans+hm.get(arr[i]);
            }
        }
        ans=ans+hm.get(arr[arr.length-1]);
    return ans;
}
}
