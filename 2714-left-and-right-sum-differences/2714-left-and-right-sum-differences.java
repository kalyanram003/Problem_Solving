class Solution {
    public int[] leftRightDifference(int[] nums) {
        int l=0;
        int n=nums.length;
        int[] lsum=new int[n];
        lsum[0]=l;
        for(int i=1;i<n;i++){
            l+=nums[i-1];
            lsum[i]=l;
        }
        int r=0;
        int[] rsum=new int[n];
        rsum[n-1]=r;
        for(int i=n-2;i>=0;i--){
            r+=nums[i+1];
            rsum[i]=r;
        }
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[i]+=Math.abs(lsum[i]-rsum[i]);
        }
        return res;
    }
}