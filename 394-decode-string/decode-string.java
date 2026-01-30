class Solution {
    public String decodeString(String s) {
        StringBuilder sb=new StringBuilder();
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c!=']'){
                st.push(c);
            }else{
                StringBuilder temp=new StringBuilder();
                while(st.peek()!='['){
                    temp.insert(0,st.pop());
                }
                st.pop();
                StringBuilder num=new StringBuilder();
                while(!st.isEmpty() && Character.isDigit(st.peek())){
                    num.insert(0,st.pop());
                }
                int k=Integer.parseInt(num.toString());
                String res=temp.toString().repeat(k);
                for(char ch:res.toCharArray()){
                    st.push(ch);
                }
            }
        }
        while(!st.isEmpty()){
            sb.insert(0,st.pop());
        }
        return sb.toString();
    }
}