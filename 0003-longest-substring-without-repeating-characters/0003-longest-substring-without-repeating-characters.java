class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> hs=new HashSet<>();
        int left=0;
        int maxi=0;
        for(int right=0;right<s.length();right++){
            while(left<right && hs.contains(s.charAt(right))){
                hs.remove(s.charAt(left));
                left++;
            }
            hs.add(s.charAt(right));
            maxi=Math.max(maxi,right-left+1);
        }
        return maxi;
    }
}