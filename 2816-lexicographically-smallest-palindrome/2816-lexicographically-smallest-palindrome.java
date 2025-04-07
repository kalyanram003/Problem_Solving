class Solution {
    public String makeSmallestPalindrome(String s) {
        int st=0;
        int end=s.length()-1;
        char[] arr=s.toCharArray();
        while(st<end){
            if(arr[st]<arr[end]){
                arr[end]=arr[st];
            }else{
                arr[st]=arr[end];
            }
            st++;
            end--;
        }
        return new String(arr);
    }
}