class Solution {
    public void sortColors(int[] nums) {
        int mid=0,low=0,high=nums.length-1;
        for(int i=0;i<nums.length;i++){
            if(nums[mid]==0){
                swap(nums,mid,low);
                mid++;
                low++;
            }else if(nums[mid]==2){
                swap(nums,mid,high);
                high--;
            }else{
                mid++;
            }
        }
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}