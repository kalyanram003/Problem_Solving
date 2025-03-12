class Solution {
    public int maximumCount(int[] nums) {
        int pos=0;
        int neg=0;
        for(int temp:nums){
            if(temp<0){
                neg++;
            }
            if(temp>0){
                pos++;
            }
        }
        return Math.max(neg,pos);
    }
}