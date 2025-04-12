class Solution {
    public boolean areOccurrencesEqual(String s) {
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
            hm.put(s.charAt(i),hm.getOrDefault(s.charAt(i),0)+1);
        }
        int freq=hm.get(s.charAt(0));
        for(int num:hm.values()){
            if(num!=freq){
                return false;
            }
        }
        return true;
    }
}