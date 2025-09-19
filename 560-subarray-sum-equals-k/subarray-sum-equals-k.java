class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer> freq=new HashMap<>();   
        freq.put(0,1);
        int sum=0;
        int cnt=0;
        for(int num:nums){
            sum+=num;
            if(freq.containsKey(sum-k)){
                cnt+=freq.get(sum-k);
            }
        freq.put(sum,freq.getOrDefault(sum,0)+1);
        }
        return cnt;
    }
}