class Solution {
    public int numIdenticalPairs(int[] nums) {
        Map<Integer, Integer> pairs = new HashMap<>();
        int cnt = 0;
        for (int i = 0; i < nums.length; i++) {
            if (pairs.containsKey(nums[i])) {
                cnt += pairs.get(nums[i]);
            }
            pairs.put(nums[i], pairs.getOrDefault(nums[i], 0) + 1);
        }
        return cnt;
    }
}