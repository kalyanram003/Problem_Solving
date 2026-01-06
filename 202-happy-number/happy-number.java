class Solution {
    public static int sumSq(int a){
        int ans=0;
        while(a!=0){
            int digit=a%10;
            ans+=(int)Math.pow(digit,2);
            a=a/10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n=sumSq(n);
        }
        return n==1;
    }
}