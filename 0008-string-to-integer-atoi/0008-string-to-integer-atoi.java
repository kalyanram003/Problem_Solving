class Solution {
    public int myAtoi(String s) {
        int sign=1,ans=0,i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        if(i<n && (s.charAt(i)=='-' || s.charAt(i)=='+')){
            sign=(s.charAt(i)=='-')?-1:1;
            i++;
        }
        while(i<n &&  Character.isDigit(s.charAt(i))){
            int digi=s.charAt(i)-'0';
            if(ans>(Integer.MAX_VALUE-digi)/10){
                return (sign==1)?Integer.MAX_VALUE:Integer.MIN_VALUE;
            }
            ans=ans*10+digi;
            i++;
        }  
        return sign*ans;
    }
}