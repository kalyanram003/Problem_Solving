class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n=position.length;
        Stack<Double> st=new Stack<>();
        int[][] cars=new int[n][2];
        for(int i=0;i<n;i++){
            cars[i][0]=position[i];
            cars[i][1]=speed[i];
        }
        Arrays.sort(cars,(a,b)->Integer.compare(b[0],a[0]));
        for(int[] car:cars){
            int pos=car[0];
            int spd=car[1];
            Double time=(double)(target-pos)/spd;
            if(st.isEmpty() || time>st.peek()){
                st.push(time);
            }
        }
        return st.size();
    }
}