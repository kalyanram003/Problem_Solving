class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        int p1=0;
        int p2=0;
        int n1=str1.length();
        int n2=str2.length();
        while(p1<n1 && p2<n2){
            char c1=str1.charAt(p1);
            char c2=str2.charAt(p2);
            if(c1==c2 || (c1+1 - 'a')%26 + 'a' == c2){
                p2++;
            }
            p1++;
        }
        return p2==n2;
    }
}