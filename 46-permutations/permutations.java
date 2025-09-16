class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans=new ArrayList<>();
        backtrack(ans,nums,new ArrayList<>());
        return ans;
    }
    public void backtrack(List<List<Integer>> ans,int[] nums,List<Integer> tempList){

        if(tempList.size()==nums.length){
            ans.add(new ArrayList<>(tempList));
        }

        for(int num:nums){
            if(tempList.contains(num)){
                continue;
            }
            tempList.add(num);
            backtrack(ans,nums,tempList);
            tempList.remove(tempList.size()-1);
        }
    }
}