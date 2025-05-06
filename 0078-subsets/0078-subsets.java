class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int[] nums,int idx,List<Integer> temp,List<List<Integer>> ans){
        ans.add(new ArrayList<>(temp));
        for(int i=idx;i<nums.length;i++){
            temp.add(nums[i]);
            backtrack(nums,i+1,temp,ans);
            temp.remove(temp.size()-1);
        }
    }
}