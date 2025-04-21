class Solution {
    public int[] getAverages(int[] nums, int k) {
        int winSize=2*k+1;
        int n=nums.length;
        int l=0;
        long winSum=0;
        int[] ans=new int[n];
        Arrays.fill(ans,-1);
        for(int r=0;r<n;r++){
            winSum+=nums[r];
            if(r-l+1>winSize){
                winSum-=nums[l];
                l++;
            }

            if(r-l+1 == winSize){
                ans[l+k]=(int)(winSum/winSize);
            }

        }
        return ans;
    }
}