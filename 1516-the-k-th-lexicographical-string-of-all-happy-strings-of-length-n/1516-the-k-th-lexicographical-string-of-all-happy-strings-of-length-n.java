class Solution {
    List<String> ans=new ArrayList<>();
    public String getHappyString(int n, int k) {
        backtrack(n,"",' ');
        if(ans.size()<k) return "";
        return ans.get(k-1);
    }
    private void backtrack(int n,String curr, char prev){
        if(curr.length()==n){
            ans.add(curr);
            return;
        }
        for(char ch:new char[]{'a','b','c'}){
            if(ch!=prev){
                backtrack(n,curr+ch,ch);
            }
        }
    }
}