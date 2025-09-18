class Solution {
    public int compress(char[] chars) {
        int i=0;
        int idx=0;
        while(i<chars.length){
            char curr=chars[i];
            int cnt=0;
            while(i<chars.length && curr==chars[i]){
                cnt++;
                i++;
            }
            chars[idx++]=curr;
            if(cnt>1){
                for(char c:Integer.toString(cnt).toCharArray()){
                    chars[idx++]=c;
                }
            }
        }
        return idx;
    }
}