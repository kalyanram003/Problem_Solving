class Solution {
    public List<List<Integer>> findSubsequences(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(nums,0,new ArrayList<>(),ans);
        return ans;
    }
    private void backtrack(int[] nums,int idx,List<Integer> temp,List<List<Integer>> ans){
        if(temp.size()>=2){
            ans.add(new ArrayList<>(temp));
        }
        HashSet<Integer> used=new HashSet<>();
        for(int i=idx;i<nums.length;i++){
            if(used.contains(nums[i])) continue;
            if(temp.size()==0 || nums[i]>=temp.get(temp.size()-1)){
                temp.add(nums[i]);
                used.add(nums[i]);
                backtrack(nums,i+1,temp,ans);
                temp.remove(temp.size()-1);
            }
        }
    }
}