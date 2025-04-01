class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int ans[]=new int[nums.length];
        int i=0;
        int equals=0;
        
        for(int num:nums){
            if(num==pivot){
                equals++;
            }
        }
        for(int num:nums){
            if(num<pivot){
                ans[i++]=num;
            }
        }

        for(int num:nums){
            if(num==pivot){
                ans[i++]=num;
            }
        }

        for(int num:nums){
            if(num>pivot){
                ans[i++]=num;
            }
        }
        return ans;
    }
}