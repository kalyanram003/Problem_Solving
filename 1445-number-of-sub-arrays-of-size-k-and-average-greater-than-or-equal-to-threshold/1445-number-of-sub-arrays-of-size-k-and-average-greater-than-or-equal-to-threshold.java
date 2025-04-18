class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int cnt=0;
        int n=arr.length;
        int sum=0;
        for(int i=0;i<k && i<n;i++){
            sum+=arr[i];
        }
        if(sum/k >= threshold){
            cnt++;
        }
        for(int i=k;i<n;i++){
            sum+=arr[i];
            sum-=arr[i-k];
            if(sum/k >= threshold){
                cnt++;
            }
        }
        return cnt;
    }
}