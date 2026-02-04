class Solution {
    public int splitArray(int[] nums, int k) {
        int l=0;
        int r=0;
        int ans=0;
        for(int num:nums){
            l=Math.max(l,num);
            r+=num;
        }
        ans=r;
        while(l<=r){
            int mid=l+(r-l)/2;
            if(canSplit(nums,k,mid)){
                ans=mid;
                r=mid-1;
            }else{
                l=mid+1;
            }
        }
        return ans;
    }
    public boolean canSplit(int[] nums,int k,int maxi){
        int curr=0;
        int subs=1;
        for(int n:nums){
            curr+=n;
            if(curr>maxi){
                subs++;
                if(subs>k) return false;
                curr=n;
            }
        }
        return true;
    }
}