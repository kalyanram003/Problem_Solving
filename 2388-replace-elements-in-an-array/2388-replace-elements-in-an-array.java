class Solution {
    public int[] arrayChange(int[] nums, int[][] operations) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],i);
        }
        for(int[] arr:operations){
            int old=arr[0];
            int ne=arr[1];
            if(hm.containsKey(old)){
                int idx=hm.get(old);
                nums[idx]=ne;
                hm.remove(old);
                hm.put(ne,idx);
            }
        }
        return nums;
    }
}