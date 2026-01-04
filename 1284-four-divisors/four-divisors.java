class Solution {
    public static int divSum(int a){
        int sum=0;
        int cnt=0;
        for (int i = 1; i * i <= a; i++) {
            if(a % i == 0){
                int j = a / i;
                if(i == j) {
                    sum += i;
                    cnt++;
                }else{
                    sum += i + j;
                    cnt += 2;
                }
                if(cnt > 4) {
                    return 0;
                }
            }
        }
        if(cnt==4){
            return sum;
        }
        return 0;
    }
    public int sumFourDivisors(int[] nums) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans+=divSum(nums[i]);
        }
        return ans;
        
    }
}