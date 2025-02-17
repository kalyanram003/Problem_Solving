class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans=new ArrayList<>();
        for(int i=1;i<=numRows;i++){
            ans.add(genrows(i));
        }
        return ans;
    }
    public static List<Integer> genrows(int numRows){
        long ans=1;
        List<Integer> ansR=new ArrayList<>();
        ansR.add(1);
        for(int i=1;i<numRows;i++){
            ans=ans*(numRows-i);
            ans=ans/i;
            ansR.add((int)ans);
        }
        return ansR;
    }
}