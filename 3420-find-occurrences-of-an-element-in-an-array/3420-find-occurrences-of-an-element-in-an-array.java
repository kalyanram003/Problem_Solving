class Solution {
    public int[] occurrencesOfElement(int[] nums, int[] queries, int x) {
        int cnt=0;
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]==x){
                cnt++;
                hm.put(cnt,i);
            }
        }
        for(int i=0;i<queries.length;i++){
            if(hm.containsKey(queries[i])){
                queries[i]=hm.get(queries[i]);
            }
            else{
                queries[i]=-1;
            }
        }
        return queries;
    }
}