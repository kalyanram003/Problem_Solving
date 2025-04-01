class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> ans=new ArrayList<>();
        List<Integer> arr=new ArrayList<>();
        

        for(int i=0;i<nums.length;i++){
            if(nums[i]==key){
                arr.add(i);
            }
        }
        for(int j=0;j<nums.length;j++){
            for(int keys:arr){
                if(Math.abs(j-keys)<=k){
                    ans.add(j);
                    break;
                }
            }
        }
        return ans;
    }
}