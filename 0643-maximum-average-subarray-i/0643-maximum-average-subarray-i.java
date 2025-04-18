class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double avg=Integer.MIN_VALUE;
        int sum=0;
        int n=nums.length;
        for(int i=0;i<k && i<n;i++){
            sum+=nums[i];
        }
        avg=(double)sum/k;
        for(int i=k;i<n;i++){
            sum+=nums[i];
            sum-=nums[i-k];
            avg=Math.max(avg,(double)sum/k);
        }
        return avg;
    }
}