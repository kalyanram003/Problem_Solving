class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> ans=new ArrayList<>();
        List<Integer> temp=new ArrayList<>();
        backTrack(ans,temp,1,n,k);
        return ans;
    }
    private void backTrack(List<List<Integer>> ans,List<Integer> temp,int st,int n,int k){
        if(temp.size()==k){
            ans.add(new ArrayList<>(temp));
            return;
        }
        for(int i=st;i<=n;i++){
            temp.add(i);
            backTrack(ans,temp,i+1,n,k);
            temp.remove(temp.size()-1);
        }
    }
}