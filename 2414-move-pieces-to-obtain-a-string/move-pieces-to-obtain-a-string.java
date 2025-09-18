class Solution {
    public boolean canChange(String start, String target) {
        if(start.equals(target)){
            return true;
        }
        int l=0;
        int r=0;
        for(int i=0;i<start.length();i++){
            char curr=start.charAt(i);
            int tar=target.charAt(i);
            if(curr=='R'){
                if(l>0){
                    return false;
                }
                r++;
            }
            if(tar=='L'){
                if(r>0){
                    return false;
                }
                l++;
            }
            if(tar=='R'){
                if(r==0){
                    return false;
                }
                r--;
            }
            if(curr=='L'){
                if(l==0){
                    return false;
                }
                l--;
            }
        }
        return l==0 && r==0;
    }
}