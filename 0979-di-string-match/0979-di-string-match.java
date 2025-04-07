class Solution {
    public int[] diStringMatch(String s) {
        int n=s.length();
        int low=0;
        int st=n;
        int[] ans=new int[n+1];
        for(int k=0;k<n;k++){
            if(s.charAt(k)=='I'){
                ans[k]=low++;
            }else{
                ans[k]=st--;
            }
        }
        ans[n]=low;
        return ans;
    }
}