class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        premHelp(nums,ans,0);
        return ans;
    }

    public void premHelp(int[] nums,List<List<Integer>> ans,int idx) {
        if(idx==nums.length){
            List<Integer> p=new ArrayList<>();
            for(int ele:nums){
                p.add(ele);
            }
            ans.add(p);
            return;
        }

        for(int i=idx;i<nums.length;i++){
            swap(nums,i,idx);
            premHelp(nums,ans,idx+1);
            swap(nums,i,idx);
        }
    }
    private void swap(int[] nums,int i,int idx){
        int temp=nums[i];
        nums[i]=nums[idx];
        nums[idx]=temp;
    }
}