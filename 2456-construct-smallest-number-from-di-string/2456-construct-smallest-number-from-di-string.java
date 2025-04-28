class Solution {
    public String smallestNumber(String pattern) {
        int n=pattern.length();
        int[] arr=new int[n+1];
        for(int i=0;i<=n;i++){
            arr[i]=i+1;
        }
        for(int i=0;i<n;i++){
            if(pattern.charAt(i)=='D'){
                int j=i;
                while(j<n && pattern.charAt(j)=='D'){
                    j++;
                }
                reverse(arr,i,j);
                i=j-1;
            }
        }
        StringBuilder sb=new StringBuilder();
        for(int num:arr){
            sb.append(num);
        }
        return sb.toString();
    }
    private static void reverse(int[] arr,int i,int j){
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
    }
}