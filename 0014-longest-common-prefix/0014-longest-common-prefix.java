class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0){
            return "";
        }
        Arrays.sort(strs);
        int n=strs.length;
        String st1=strs[0];
        String st2=strs[n-1];
        int k=0;
        while(k<st1.length() && k<st2.length()){
            if(st1.charAt(k)==st2.charAt(k)){
                k++;
            }
            else{
                break;
            }
        }
        return st1.substring(0,k);
    }
}