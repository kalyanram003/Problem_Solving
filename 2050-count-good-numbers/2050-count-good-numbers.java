class Solution {
    private static final long MOD = 1_000_000_007;
    public int countGoodNumbers(long n) {
        long even = (n + 1) / 2;  
        long odd = n / 2;         

        long first = pow(5, even);   
        long second = pow(4, odd);   

        return (int)((first * second) % MOD);
    }

    private long pow(long x, long n) {
        if (n == 0) return 1;

        long temp = pow(x, n / 2);
        temp = (temp * temp) % MOD;

        if (n % 2 == 0) {
            return temp;
        } else {
            return (x * temp) % MOD;
        }
    }
}
