class Solution {
    public String longestPalindrome(String s) {
        if(s==null || s.length()<2){
            return s;
        }
        String longest="";
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                String sub=s.substring(i,j+1);
                if(isPalin(sub) && sub.length()>longest.length()){
                    longest=sub;
                }
            }
        }
        return longest;
    }
    public static boolean isPalin(String str){
        int left=0;
        int right=str.length()-1;
        while(left<right){
            if(str.charAt(left++)!=str.charAt(right--)){
                return false;
            }
        }
        return true;
    }
}