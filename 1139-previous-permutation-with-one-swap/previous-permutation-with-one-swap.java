class Solution {
    public int[] prevPermOpt1(int[] arr) {
        int n=arr.length;
        int i=n-2;
        while(i>=0 && arr[i]<=arr[i+1]){
            i--;
        }
        if(i>=0){
            int j=n-1;
            while(arr[i]<=arr[j]){
                j--;
            }
            while(j-1>=0 && arr[j]==arr[j-1]){
                j--;
            }
            swap(arr,i,j);
        }
        return arr;
    }
    public void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
}