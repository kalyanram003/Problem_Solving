class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        int n=nums.length;
        int sub=1<<n;
        for(int mem=0;mem<sub;mem++){
            List<Integer> list=new ArrayList<>();
            for(int i=0;i<n;i++){
                if((mem & (1<<i))!=0){
                    list.add(nums[i]);
                }
            }
            ans.add(list);
        }
        return ans;
    }
}