class Solution {
    public int[] twoSum(int[] numbers, int target) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<numbers.length;i++){
            int temp=numbers[i];
            if(hm.containsKey(target-temp)){
                return new int[]{hm.get(target-temp)+1,i+1};
            }
            hm.put(temp,i);
        }
        return new int[]{};
    }
}