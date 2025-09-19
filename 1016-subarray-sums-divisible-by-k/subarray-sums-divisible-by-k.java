class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();
        freq.put(0,1);
        int sum=0;
        int cnt=0;
        for(int num:nums){
            sum+=num;
            int rem=sum%k;
            if(rem<0){
                rem+=k;
            }
            if(freq.containsKey(rem)){
                cnt+=freq.get(rem);
            }
            freq.put(rem,freq.getOrDefault(rem,0)+1);
        }
        return cnt;
    }
}