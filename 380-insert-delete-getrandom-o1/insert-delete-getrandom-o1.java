class RandomizedSet {
    List<Integer> list;
    Map<Integer,Integer> hm;
    Random rand;

    public RandomizedSet() {
        list=new ArrayList<>();
        hm=new HashMap<>();
        rand=new Random();
    }
    
    public boolean insert(int val) {
        if(hm.containsKey(val)){
            return false;
        }
        hm.put(val,list.size());
        list.add(val);
        return true;
    }
    
    public boolean remove(int val) {
        if(!hm.containsKey(val)){
            return false;
        }
        int idx=hm.get(val);
        int lastItem=list.get(list.size()-1);
        list.set(idx,lastItem);
        hm.put(lastItem,idx);
        list.remove(list.size()-1);
        hm.remove(val);
        return true;
    }
    
    public int getRandom() {
        int random=rand.nextInt(list.size());
        return list.get(random);
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */