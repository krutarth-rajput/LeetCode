class Solution {
    public boolean checkRecord(String s) {
        int late=0;
        int absent=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='A'){
                absent++;
            }
            if(s.charAt(i)=='L'&&late>=0){
                late++;
            }
            if(s.charAt(i)!='L'&&late>0){
                late=0;
            }
            if(late>=3){
                return false;
            }
            if(absent>1){
                return false;
            }
            
        }
        return true;
    }
}
