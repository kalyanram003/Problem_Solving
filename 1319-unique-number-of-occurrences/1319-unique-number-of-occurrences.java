class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int num:arr){
            hm.put(num,hm.getOrDefault(num,0)+1);
        }
        HashSet<Integer> ans=new HashSet<>();
        for(int vals:hm.values()){
            if(ans.contains(vals)){
                return false;
            }
            ans.add(vals);
        }
        return true;
    }
}