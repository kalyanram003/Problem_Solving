class Solution {
    public String mergeAlternately(String word1, String word2) {
        int s1=0;
        int s2=0;
        int n1=word1.length();
        int n2=word2.length();
        StringBuilder ans=new StringBuilder();
        while(s1<n1 || s2<n2){
            if(s1<n1){
                ans.append(word1.charAt(s1));
                s1++;
            }
            if(s2<n2){
                ans.append(word2.charAt(s2));
                s2++;
            }
        }
        return ans.toString();
    }
}