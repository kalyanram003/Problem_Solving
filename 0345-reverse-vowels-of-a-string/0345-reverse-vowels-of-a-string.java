class Solution {
    public String reverseVowels(String s) {
        int n=s.length();
        char[] arr=s.toCharArray();
        int st=0;
        int end=n-1;
        while(st<end){
            while(st < end && !isVowel(arr[st])){
                st++;
            }
            while(st <end && !isVowel(arr[end])){
                end--;
            }
            char temp=arr[st];
            arr[st]=arr[end];
            arr[end]=temp;
            st++;
            end--;
        }
        return new String(arr);
    }
    public boolean isVowel(char ch){
        ch=Character.toLowerCase(ch);
        return (ch=='a' ||ch=='e' ||ch=='i' ||ch=='o' ||ch=='u');
    }
}