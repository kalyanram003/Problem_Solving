//can also have fast and slow pointer approach
class Solution {
    public int findDuplicate(int[] nums) {
        HashSet<Integer> visited=new HashSet<>();
        for(int num:nums){
            if(visited.contains(num)){
                return num;
            }
            visited.add(num);
        }
        return -1;
    }
}