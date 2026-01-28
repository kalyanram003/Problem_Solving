class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int a:asteroids){
            boolean alive=true;
            while(!st.isEmpty() && a<0 && st.peek()>0){
                if(Math.abs(st.peek())<Math.abs(a)){
                    st.pop();
                }else if(Math.abs(st.peek())==Math.abs(a)){
                    alive=false;
                    st.pop();
                    break;
                }else{
                    alive=false;
                    break;
                }
            }
            if(alive){
                st.push(a);
            }
        }
        return st.stream().mapToInt(i->i).toArray();
    }
}