class Solution {
    public int strStr(String haystack, String needle) {
        int n1=haystack.length();
        int n2=needle.length();
        if(n1<n2){
            return -1;
        }
        for(int i=0;i<=n1-n2;i++){
            if(haystack.substring(i,i+n2).equals(needle)){
                return i;
            }
        }
        return -1;
    }
}