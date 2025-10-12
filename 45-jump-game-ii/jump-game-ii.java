class Solution {
    public int jump(int[] nums) {
        int n=nums.length;
        int cnt=0;
        int maxR=0;
        int end=0;
        if(n==1) return 0;
        for(int i=0;i<n;i++){
            maxR=Math.max(nums[i]+i,maxR);
            if(i==end){
                cnt++;
                end=maxR;
                if(end>=n-1){
                    break;
                }
            }
        }
        return cnt;
    }
}