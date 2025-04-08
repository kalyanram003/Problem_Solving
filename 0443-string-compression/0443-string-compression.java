class Solution {
    public int compress(char[] chars) {
        int n=chars.length;
        int idx=0;
        int i=0;
        while(i<n){
            char c=chars[i];
            int cnt=0;
            while(i<n && chars[i]==c){
                i++;
                cnt++;
            }
            chars[idx++]=c;

            if(cnt>1){
                for(char j:Integer.toString(cnt).toCharArray()){
                    chars[idx++]=j;
                }
            }
        }
        return idx;
    }
}