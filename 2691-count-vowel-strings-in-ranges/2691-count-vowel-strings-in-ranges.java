class Solution {
    public int[] vowelStrings(String[] words, int[][] queries) {
        int n=words.length;
        int[] prefix=new int[n+1];
        for(int i=0;i<n;i++){
            prefix[i+1]+=prefix[i]+(isVowel(words[i].charAt(0)) && isVowel(words[i].charAt(words[i].length()-1))?1:0);
        }
        int[] res=new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int left=queries[i][0];
            int right=queries[i][1];
            res[i]=prefix[right+1]-prefix[left];
        }
        return res;
    }
    public boolean isVowel(char c){
        c=Character.toLowerCase(c);
        return (c=='a' || c=='e' || c=='i' || c=='i' || c=='o' || c=='u'); 
    }
}