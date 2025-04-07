class Solution {
    public String largestMerge(String word1, String word2) {
        StringBuilder ans=new StringBuilder();
        int n1=word1.length();
        int n2=word2.length();
        int p1=0,p2=0;
        while(p1<n1 || p2<n2){
            if(word1.substring(p1).compareTo(word2.substring(p2))>0){
                ans.append(word1.charAt(p1++));
            }else{
                ans.append(word2.charAt(p2++));
            }
        }
        ans.append(word1.substring(p1));
        ans.append(word2.substring(p2));
        return ans.toString();
    }
}