class Solution {
    public int isWinner(int[] player1, int[] player2) {
        int score1=count(player1);
        int score2=count(player2);
        if(score1>score2){
            return 1;
        }else if(score1==score2){
            return 0;
        }else{
            return 2;
        }
    }
    public static int count(int[] arr){
        int ans=arr[0];
        int a=1;
        if(arr.length==1){
            ans=arr[0];
            return ans;
        }
        if(arr[0]==10){
                ans=ans+(arr[a]*2);    
            }else{
                ans=ans+arr[a];
            }
        for(int i=2;i<arr.length;i++){
            if(arr[i-1]==10||arr[i-2]==10){
                ans=ans+(arr[i]*2);
            }else{
                ans=ans+arr[i];
            }
        }
        return ans;
    }
}
