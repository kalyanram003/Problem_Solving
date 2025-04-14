class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer> fmap=new HashMap<>();
        StringBuilder sb=new StringBuilder();
        for(char c:s.toCharArray()){
            fmap.put(c,fmap.getOrDefault(c,0)+1);
        }
        PriorityQueue<Character> pq=new PriorityQueue<>((a,b)->fmap.get(b)-fmap.get(a));
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