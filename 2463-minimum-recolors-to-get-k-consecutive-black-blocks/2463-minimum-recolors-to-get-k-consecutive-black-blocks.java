class Solution {
    public int minimumRecolors(String blocks, int k) {
        int n=blocks.length();
        int maxi=Integer.MAX_VALUE;
        for(int i=0;i<=n-k;i++){
            int cnt=0;
            for(int j=i;j<i+k;j++){
                if(blocks.charAt(j)=='W'){
                    cnt++;
                }
            }
            maxi=Math.min(maxi,cnt);
        }
        return maxi;
    }
}