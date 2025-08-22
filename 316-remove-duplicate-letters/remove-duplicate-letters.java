class Solution {
    public String removeDuplicateLetters(String s) {
        int[] chr=new int[26];
        boolean[] seen=new boolean[26];
        for(char ch:s.toCharArray()){
            chr[ch-'a']++;
        }
        Stack<Character> st=new Stack<>();
        for(char ch:s.toCharArray()){
            chr[ch-'a']--;
            if(seen[ch-'a']) continue;

            while(!st.isEmpty()  && ch<st.peek() && chr[st.peek()-'a']>0){
                seen[st.pop()-'a']=false;
            }
            st.push(ch);
            seen[ch-'a']=true;
        }
        StringBuilder sb=new StringBuilder();
        for(char ch:st){
            sb.append(ch);
        }
        return sb.toString();
    }
}