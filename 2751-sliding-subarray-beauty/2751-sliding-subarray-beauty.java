class Solution {
    public int[] getSubarrayBeauty(int[] nums, int k, int x) {
        int n=nums.length;
        int[] ans=new int[n-k+1];
        int i=0;
        int j=0;
        TreeMap<Integer,Integer> arr=new TreeMap<>();
        while(j<n){
            if (nums[j] < 0) {
                arr.put(nums[j],arr.getOrDefault(nums[j],0)+1);
            }
            if(j-i+1==k){
                int cnt=0;
                int beauty=0;
                for(int key:arr.keySet()){
                    cnt+=arr.get(key);
                    if(cnt>=x){
                        beauty=key;
                        break;
                    }
                }
                ans[i]=beauty;
                if (nums[i] < 0) {
                    arr.put(nums[i], arr.get(nums[i]) - 1);
                    if (arr.get(nums[i]) == 0) {
                        arr.remove(nums[i]);
                    }
                }
                i++;
            }
            j++;
        }
        return ans;
    }
}