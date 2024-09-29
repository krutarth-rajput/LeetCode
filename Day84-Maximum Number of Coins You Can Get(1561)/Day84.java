class Solution {
    public int maxCoins(int[] piles) {
        Arrays.sort(piles);
        int us=piles.length-2;
        int count=3;
        int coins=piles[us];
        while(count!=piles.length){
            us=us-2;
            coins=coins+piles[us];
            count=count+3;
        }
        return coins;
    }
}
