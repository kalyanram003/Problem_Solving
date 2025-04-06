class Solution {
    public String reverseWords(String s) {
        StringBuilder ans=new StringBuilder();
        String[] arr=s.split("\\s+");
        int i=0;
        while(i<arr.length){
            StringBuilder temp=new StringBuilder(arr[i]);
            ans.append(temp.reverse());
            if(i!=arr.length-1){
                ans.append(" ");
            }
            i++;
        }
        return ans.toString();
    }
}