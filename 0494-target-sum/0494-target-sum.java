class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return correctWays(nums,0,0,target);
    }
    private int correctWays(int[] nums,int idx,int Csum,int target){
        if(nums.length==idx){
            return target==Csum?1:0;
        }
        int add = correctWays(nums,idx+1,Csum+nums[idx],target);

        int sub = correctWays(nums,idx+1,Csum-nums[idx],target);

        return add+sub;
    }
}