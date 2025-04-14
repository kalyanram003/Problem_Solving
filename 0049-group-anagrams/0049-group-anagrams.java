class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List<String>> ans=new HashMap<>();
        for(String val:strs){
            char[] ch=val.toCharArray();
            Arrays.sort(ch);
            String key=new String(ch);
            if(!ans.containsKey(key)){
                ans.put(key,new ArrayList<>());
            }
            ans.get(key).add(val);
        }
        return new ArrayList<>(ans.values());

    }
}