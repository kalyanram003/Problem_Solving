class Solution {
    public String reverseVowels(String s) {
       int l=0;
       int r=s.length()-1;
       char[] arr=s.toCharArray();
       while(l<r){
            if(!isVowel(arr[l])){
                l++;
            }else if(!isVowel(arr[r])){
                r--;
            }else{
                char temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                l++;
                r--;
            }
       }
       return new String(arr);
    }
    public boolean isVowel(char c){
        return (c=='a' || c=='A' ||
                c=='e' || c=='E' ||
                c=='i' || c=='I' ||
                c=='o' || c=='O' ||
                c=='u' || c=='U');
    }
}