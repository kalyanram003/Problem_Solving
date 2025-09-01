class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String,List<String>> hm=new HashMap<>();
        for(String st:strs){
            char[] temp=st.toCharArray();
            Arrays.sort(temp);
            String key=new String(temp);
            hm.putIfAbsent(key,new ArrayList<>());
            hm.get(key).add(st);
        }
        return new ArrayList(hm.values());
    }
}