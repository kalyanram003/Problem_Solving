class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans=new ArrayList<>();
        Arrays.sort(candidates);
        backtrack(candidates,target,ans,0,new ArrayList<>());
        return ans;
    }
    private void backtrack(int[] candidates,int target,List<List<Integer>> ans,int st,List<Integer> temp){
        if(target==0){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=st;i<candidates.length;i++){
            if(i>st && candidates[i]==candidates[i-1]) continue;

            if(candidates[i]>target) break;

            temp.add(candidates[i]);
            backtrack(candidates,target-candidates[i],ans,i+1,temp);
            temp.remove(temp.size()-1);

        }
    }
}