class Solution {
    public String frequencySort(String s) {
        StringBuilder sb=new StringBuilder();
        Map<Character,Integer> fmap=new HashMap<>();
        for(char ch:s.toCharArray()){
            fmap.put(ch,fmap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)-> fmap.get(b)-fmap.get(a));
        pq.addAll(fmap.keySet());
        while(!pq.isEmpty()){
            char curr=pq.poll();
            int cnt=fmap.get(curr);
            for(int i=0;i<cnt;i++){
                sb.append(curr);
            }
        }
        return sb.toString();
    }
}