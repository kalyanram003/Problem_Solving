class Solution {
    public int singleNonDuplicate(int[] nums) {
        int left=0;
        int right=nums.length-1;
        while(left<right){
            int mid=left+right>>1;
            if(mid%2==1){
                mid--;
            }
            if(nums[mid]==nums[mid+1]){
                left=mid+2;
            }
            else{
                right=mid;
            }
        }
        return nums[left];
    }
}
//bruteforce
// class Solution {
//     public int singleNonDuplicate(int[] nums) {
//         if(nums.length==1){
//             return nums[0];
//         }
//         for(int i=0;i<nums.length;i+=2){
//             if(i==nums.length-1 || nums[i]!=nums[i+1]){
//                 return nums[i];
//             }
//         }
//         return -1;
//     }
// }