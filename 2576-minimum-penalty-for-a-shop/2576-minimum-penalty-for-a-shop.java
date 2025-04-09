class Solution {
    public int bestClosingTime(String customers) {
        int penalty=0;
        for(char c:customers.toCharArray()){
            if(c=='Y'){
                penalty++;
            }
        }
        int minP=penalty;
        int hr=0;
        for(int i=0;i<customers.length();i++){
            if(customers.charAt(i)=='Y'){
                penalty--;
            }
            else{
                penalty++;
            }
            if(penalty<minP){
                minP=penalty;
                hr=i+1;
            }
        }
        return hr;
    }
}