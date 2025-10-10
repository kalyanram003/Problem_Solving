class Solution {
    public int removeDuplicates(int[] nums) {
        Set<Integer> hs=new HashSet<>();
        int idx=0;
        for(int i=0;i<nums.length;i++){
            if(!hs.contains(nums[i])){
                nums[idx]=nums[i];
                idx++;
            }
            hs.add(nums[i]);
        }
        return idx;
    }
}