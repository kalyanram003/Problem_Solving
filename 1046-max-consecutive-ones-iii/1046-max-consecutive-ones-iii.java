class Solution {
    public int longestOnes(int[] nums, int k) {
        int n=nums.length;
        int l=0,r=0,len=0,maxi=0,z=0;
        while(r<n){
            if(nums[r]==0){
                z++;
            }
            while(z>k){
                if(nums[l]==0){
                    z--;
                }
                l++;
            }
            if(z<=k){
                len=r-l+1;
                maxi=Math.max(len,maxi);
            }
            r++;
        }
        return maxi;
    }
}