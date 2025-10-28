class Solution {
    public String longestCommonPrefix(String[] strs) {
        int n=strs.length;
        Arrays.sort(strs);
        int l=0;
        int r=n-1;
        String first=strs[l];
        String last=strs[r];
        int common=0;
        while(common<first.length() && common<last.length()
            && strs[l].charAt(common)==strs[r].charAt(common)
        ){
            common++;
        }
        return first.substring(0,common);
    }
}