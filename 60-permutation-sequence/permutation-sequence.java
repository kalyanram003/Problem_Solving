class Solution {
    public String getPermutation(int n, int k) {
        List<Integer> nums=new ArrayList<>();
        for(int i=1;i<=n;i++){
            nums.add(i);
        }
        int[] fact=new int[n];
        fact[0]=1;
        for(int i=1;i<n;i++){
            fact[i]=i*fact[i-1];
        }
        k--;
        StringBuilder sb=new StringBuilder();
        for(int i=n;i>=1;i--){
            int idx=k/fact[i-1];
            sb.append(nums.get(idx));
            nums.remove(nums.get(idx));
            k=k%fact[i-1];
        }
        return sb.toString();
    }
}