class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int currGas=0;
        int start=0;
        int n=gas.length;
        int gasSum=0;
        int costSum=0;
        for(int i=0;i<n;i++){
            gasSum+=gas[i];
            costSum+=cost[i];
            currGas+=gas[i]-cost[i];
            if(currGas<0){
                start=i+1;
                currGas=0;
            }
        }
        return gasSum>=costSum?start:-1;
    }
}