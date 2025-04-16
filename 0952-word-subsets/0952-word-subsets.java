class Solution {
    public List<String> wordSubsets(String[] words1, String[] words2) {
        int[] req=new int[26];
        for(String wrd:words2){
            int[] wrdFreq=new int[26];
            for(char ch:wrd.toCharArray()){
                wrdFreq[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                req[i]=Math.max(req[i],wrdFreq[i]);
            }
        }
        List<String> ans=new ArrayList<>();
        for(String wrd:words1){
            boolean isValid=true;
            int[] wrd2=new int[26];
            for(char ch:wrd.toCharArray()){
                wrd2[ch-'a']++;
            }
            for(int i=0;i<26;i++){
                if(wrd2[i]<req[i]){
                    isValid=false;
                    break;
                }
            }
            if(isValid){
                ans.add(wrd);
            }
        }
        return ans;
    }
}