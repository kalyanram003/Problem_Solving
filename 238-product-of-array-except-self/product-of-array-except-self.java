class Solution {
    public int[] productExceptSelf(int[] nums) {
        int zr=0;
        int n=nums.length;
        int[] ans=new int[n];
        int prod=1;
        for(int num:nums){
            if(num==0){
                zr++;
            }else{
                prod=prod*num;
            }
        }
        if(zr>1){
            Arrays.fill(ans,0);
        }else if(zr==1){  
            for(int i=0;i<n;i++){
                if(nums[i]==0){
                    ans[i]=prod;
                }else{
                    ans[i]=0;
                }
            }
        }else{
            for(int i=0;i<n;i++){
                if(nums[i]!=0){
                    ans[i]=prod/nums[i];
                }
            }
        }
        return ans;
    }
}