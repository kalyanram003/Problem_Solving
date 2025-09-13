class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int cnt=0;
        int l=0;
        int minLen=Integer.MAX_VALUE;
        for(int r=0;r<nums.length;r++){
            cnt+=nums[r];
            while(cnt>=target){
                minLen=Math.min(minLen,r-l+1);
                cnt-=nums[l];
                l++;
            }
        }
        return minLen==Integer.MAX_VALUE?0:minLen;
    }
}