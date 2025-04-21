class Solution {
    public int maxScore(int[] cardPoints, int k) {
        int n=cardPoints.length;
        int maxi=0;
        int sum=0;
        if(n==k){
            for(int i=0;i<k;i++){
                sum+=cardPoints[i];
            }
            return sum;
        }
        for(int i=0;i<k;i++){
            sum+=cardPoints[i];
        }
        maxi=Math.max(maxi,sum);

        int left = k - 1;
        int right = n - 1;

        while (left >= 0) {
            sum = sum - cardPoints[left] + cardPoints[right];
            maxi = Math.max(maxi, sum);
            left--;
            right--;
        }

        return maxi;

    }
}