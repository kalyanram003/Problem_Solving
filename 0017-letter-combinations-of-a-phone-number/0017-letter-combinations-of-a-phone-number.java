class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans=new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        String[] maps={
            "",
            "",
            "abc",
            "def",  
            "ghi",  
            "jkl",  
            "mno",  
            "pqrs", 
            "tuv",  
            "wxyz"
        };
        backtrack(digits,0,new StringBuilder(),ans,maps);
        return ans;
    }
    private void backtrack(String digits,int idx,StringBuilder temp,List<String> ans,String[] maps){
        if(idx==digits.length()){
            ans.add(temp.toString());
            return;
        }
        String letters=maps[digits.charAt(idx)-'0'];
        for(char ch:letters.toCharArray()){
            temp.append(ch);
            backtrack(digits,idx+1,temp,ans,maps);
            temp.deleteCharAt(temp.length()-1);
        }
    }
}