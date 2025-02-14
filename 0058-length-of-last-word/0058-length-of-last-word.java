class Solution {
    public int lengthOfLastWord(String s) {
        String[] strs=s.split(" ");
        int n=strs.length;
        return strs[n-1].length();
    }
}