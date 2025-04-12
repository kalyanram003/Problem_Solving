class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> hs=new HashMap<>();
        int sum=0;
        for(int num:nums){
            hs.put(num,hs.getOrDefault(num,0)+1);
        }
        for(int num:hs.keySet()){
            if(hs.get(num)==1){
                sum+=num;
            }
        }
        return sum;
    }
}