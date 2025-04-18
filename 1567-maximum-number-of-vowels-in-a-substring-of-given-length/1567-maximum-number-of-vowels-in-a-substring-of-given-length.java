class Solution {
    public int maxVowels(String s, int k) {
        int maxi=0;
        int n=s.length();
        int curr=0;
        for(int i=0;i<k && i<n; i++){
            if(isVowel(s.charAt(i))){
                curr++;
            }
        }
        maxi=curr;
        for(int i=k;i<n;i++){
            if(isVowel(s.charAt(i-k))){
                curr--;
            }
            if(isVowel(s.charAt(i))){
                curr++;
            }
            maxi=Math.max(curr,maxi);
        }
        return maxi;
    }

    public boolean isVowel(char ch){
        ch =Character.toLowerCase(ch);
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
    }
}