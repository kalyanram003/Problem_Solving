class Solution {
    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(k,n,ans,0,new ArrayList<>(),0);
        return ans;
    }
    private void backtrack(int k,int n,List<List<Integer>> ans,int st,List<Integer> temp,int sum){
        if(sum==n && temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        if(sum>n && temp.size()>k) return;

        for(int i=st+1;i<=9;i++){
            temp.add(i);
            backtrack(k,n,ans,i,temp,sum+i);
            temp.remove(temp.size()-1);
        }
    }
}