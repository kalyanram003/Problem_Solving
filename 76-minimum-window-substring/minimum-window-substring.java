class Solution {
    public String minWindow(String s, String t) {
        int n1=s.length();
        int n2=t.length();
        if(n2>n1){
            return "";
        }
        int minLen=Integer.MAX_VALUE;
        int l=0,r=0;
        int cnt=t.length();
        int start=0;
        int[] freq=new int[128];
        for(char ch:t.toCharArray()){
            freq[ch]++;
        } 
        while(r<s.length()){
            char c=s.charAt(r);
            if(freq[c]>0){
                cnt--;
            }
            freq[c]--;
            r++;
            while(cnt==0){
                if(r-l<minLen){
                    minLen=r-l;
                    start=l;
                }
                int lc=s.charAt(l);
                freq[lc]++;
                if(freq[lc]>0){
                    cnt++;
                }
                l++;
            }
        }
        return (minLen==Integer.MAX_VALUE)?"":s.substring(start,start+minLen);
    }
}