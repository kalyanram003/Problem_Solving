class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> me=new HashMap<>();
        List<Integer> ans=new ArrayList<>();
        for(int num:nums){
            me.put(num,me.getOrDefault(num,0)+1);
        }
        for(int key:me.keySet()){
            if(me.get(key)>nums.length/3){
                ans.add(key);
            }
        }
        return ans;
    }
}