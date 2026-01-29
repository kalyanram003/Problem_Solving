class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(String t:tokens){
            if(t.equals("+") || t.equals("-") || t.equals("*") || t.equals("/")){
                int b=st.pop();
                int a=st.pop();
                int res=switch(t){
                    case "+" -> a+b;
                    case "-" -> a-b;
                    case "*" -> a*b;
                    default -> a/b;
                };
                st.push(res);
            }else{
                st.push(Integer.parseInt(t));
            }
        }
        return st.peek();
    }
}