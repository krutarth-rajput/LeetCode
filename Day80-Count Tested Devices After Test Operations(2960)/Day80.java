class Solution {
    public int countTestedDevices(int[] batteryPercentages) {
        int sub=0;
        int count=0;
        for(int i=0;i<batteryPercentages.length;i++){
            batteryPercentages[i]=batteryPercentages[i]-sub;
            if(batteryPercentages[i]>0){count++;sub++;}
        }
        return count;
    }
}
