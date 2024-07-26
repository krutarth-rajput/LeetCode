class Solution {
    public double averageWaitingTime(int[][] customers) {
        int[] wait=new int[customers.length];
        int orderserved=0;
        for(int i=0;i<customers.length;i++){
            int arrival=customers[i][0];
            int cooktime=customers[i][1];
            if(orderserved>arrival){
                orderserved=orderserved+cooktime;
            }else{
                orderserved=cooktime+arrival;
            }
            
            wait[i]=orderserved-arrival;
        }
        double totalWait=0;
        for(int i=0;i<wait.length;i++){
            totalWait=totalWait+wait[i];
        }
        return totalWait/wait.length;
    }
}
