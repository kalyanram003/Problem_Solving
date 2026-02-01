class Solution {
    public int mySqrt(int x) {
        if(x<2){
            return x;
        }
        int l=1;
        int h=x/2;
        while(l<=h){
            int m=l+(h-l)/2;
            long sq=(long)m*m;
            if(sq==x){
                return m;
            }else if(sq<x){
                l=m+1;
            }else{
                h=m-1;
            }
        }
        return h;
    }
}