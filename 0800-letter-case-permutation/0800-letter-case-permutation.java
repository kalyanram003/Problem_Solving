class Solution {
    public List<String> letterCasePermutation(String s) {
        List<String> ans =new ArrayList<>();
        if(s.length()==0){
            return ans;
        }
        backtrack(s,0,new StringBuilder(),ans);
        return ans;
    }
    private void backtrack(String s,int idx,StringBuilder temp,List<String> ans){
        if(idx==s.length()){
            ans.add(temp.toString());
            return;
        }
        char ch=s.charAt(idx);
        if(Character.isDigit(ch)){
            temp.append(ch);
            backtrack(s,idx+1,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }else{
            temp.append(Character.toLowerCase(ch));
            backtrack(s,idx+1,temp,ans);
            temp.deleteCharAt(temp.length()-1);

            temp.append(Character.toUpperCase(ch));
            backtrack(s,idx+1,temp,ans);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}