class Solution {
    public int[] findIntersectionValues(int[] nums1, int[] nums2) {
        HashSet<Integer> l1=new HashSet<>();
        HashSet<Integer> l2=new HashSet<>();
        for(int num:nums1){
            l1.add(num);
        }
        for(int num:nums2){
            l2.add(num);
        }
        int cnt1=0;
        for(int num:nums1){
            if(l2.contains(num)){
            cnt1++;
            }
        }
        int cnt2=0;
        for(int num:nums2){
            if(l1.contains(num)){
                cnt2++;
            }
        }
        return new int[]{cnt1,cnt2};
    }
}