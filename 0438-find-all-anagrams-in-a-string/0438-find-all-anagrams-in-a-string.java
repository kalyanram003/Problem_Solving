class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans=new ArrayList<>();
        int[] sArr=new int[26];
        int[] pArr=new int[26];
        for(char ch:p.toCharArray()){
            pArr[ch-'a']++;
        }

        for(int i=0;i<s.length();i++){
            sArr[s.charAt(i)-'a']++;

            if(i>=p.length()){
                sArr[s.charAt(i-p.length())-'a']--;
            }

            if(Arrays.equals(sArr,pArr)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
    }
}