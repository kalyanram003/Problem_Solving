class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> hs=new HashMap();
        Long maxi=Long.MIN_VALUE;
        int n=nums.length;
        Long sum=0L;
        int i=0;
        for(int j=0;j<n;j++){
            hs.put(nums[j],hs.getOrDefault(nums[j],0)+1);
            sum+=nums[j];

            if(j-i+1>k){
                hs.put(nums[i],hs.get(nums[i])-1);
                if(hs.get(nums[i])==0){
                    hs.remove(nums[i]);
                }
                sum-=nums[i];
                i++;
            }
            if(j-i+1==k && hs.size()==k){
                maxi=Math.max(maxi,sum);
            }

        }
        return maxi==Long.MIN_VALUE?0:maxi;
    }
}