class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int n=nums.length;
        int a=0;
        int b=1;
        int[] ans=new int[n];
        for(int i=0;i<n;i++){
            if(nums[i]%2==0){
                ans[a]=nums[i];
                a+=2;
            }else{
                ans[b]=nums[i];
                b+=2;
            }
        }
        return ans;
    }
}