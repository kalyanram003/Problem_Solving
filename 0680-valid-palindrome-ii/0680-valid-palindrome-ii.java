class Solution {
    public boolean validPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        while(st<end){
            if(s.charAt(st)==s.charAt(end)){
                st++;
                end--;
            }     
            else{
                return isPalin(s,st+1,end) || isPalin(s,st,end-1);
            }       
        }
        return  true;
    }
    public boolean isPalin(String s,int st,int end){
        while(st<end){
            if(s.charAt(st)!=s.charAt(end)){
                return false;
            }
            st++;
            end--;
        }
        return true;
    }
}