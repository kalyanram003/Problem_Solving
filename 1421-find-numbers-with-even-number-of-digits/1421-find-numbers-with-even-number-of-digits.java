class Solution {
    public int findNumbers(int[] nums) {
        int even=0;
        int n=nums.length;
        for(int i=0;i<n;i++){
        int c=0;
        while(nums[i]!=0){
            c++;
            nums[i]=nums[i]/10;
        }
        if(c%2==0){
            even++;
        }
       }
        return even;
    }
}