class Solution {
    public void reverseString(char[] s) {
        // System.out.print(s[3]);
        // for(int i=s.length-1;i>=0;i--){
        //     System.out.print(s[i]);
        // }
        char temp;
        int n=s.length;
        int i=0;
            for(int j=n-1;i<j;j--){
                temp=s[i];
                s[i]=s[j];
                s[j]=temp;
                i++;
            }
        // for(int i=0;i<s.length;i++){
        //     System.out.print(s[i]);
        // }
    }
}