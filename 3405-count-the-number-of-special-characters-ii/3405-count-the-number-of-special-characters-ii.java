class Solution {
    public int numberOfSpecialChars(String word) {
        HashMap<Character,Integer> lower=new HashMap<>();
        HashMap<Character,Integer> upper=new HashMap<>();
        for(int i=0;i<word.length();i++){
            char c=word.charAt(i);
            if(Character.isLowerCase(c)){
                lower.put(c,i);
            }else{
                upper.putIfAbsent(c,i);
            }
        }
        int cnt=0;
        for(char ch='a';ch<='z';ch++){
            if(lower.containsKey(ch) && upper.containsKey(Character.toUpperCase(ch))){
                if(lower.get(ch)<upper.get(Character.toUpperCase(ch))){
                    cnt++;
                }
            }
        }
        return cnt;
    }
}