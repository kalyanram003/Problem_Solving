class Solution {
    public int[] productExceptSelf(int[] nums) {
        int prod=1;
        int zr=0;
        for(int num:nums){
            if(num!=0){
                prod*=num;
            }else{
                zr++;
            }
        }

        if(zr>1){
            return new int[nums.length];
        }

        int[] res=new int[nums.length];
        for(int i=0;i<nums.length;i++){
            if(zr>0){
                res[i]=(nums[i]==0)?prod:0;
            }else{
                res[i]=prod/nums[i];
            }
        }
        return res;
    }
}