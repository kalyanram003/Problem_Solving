class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(candidates,new ArrayList<>(),0,target,ans);
        return ans;
    }
    private void backtrack(int[] candidates,List<Integer> temp,int st,int target,List<List<Integer>> ans){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=st;i<candidates.length;i++){
            if(candidates[i]>target) continue;

            temp.add(candidates[i]);
            backtrack(candidates,temp,i,target-candidates[i],ans);
            temp.remove(temp.size()-1);
        }
    }
}