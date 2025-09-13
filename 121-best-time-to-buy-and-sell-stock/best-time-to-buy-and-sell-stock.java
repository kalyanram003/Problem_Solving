class Solution {
    public int maxProfit(int[] prices) {
        int maxi=0;
        int lowPrice=prices[0];
        for(int i=0;i<prices.length;i++){
            if(prices[i]<lowPrice){
                lowPrice=prices[i];
            }
            int currPrice=prices[i]-lowPrice;
            maxi=Math.max(maxi,currPrice);
        }
        return maxi;
    }
}