class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String> hs=new HashSet<>();
        for(int i=0;i<=s.length()-k;i++){
            String sub=s.substring(i,i+k);
            hs.add(sub);
        }
        return hs.size()==(1<<k);
    }
}