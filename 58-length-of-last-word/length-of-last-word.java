class Solution {
    public int lengthOfLastWord(String s) {
        String[] ans=s.split(" ");
        int n=ans.length;
        return ans[n-1].length();
    }
}