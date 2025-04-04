class Solution {
    public int minimumRefill(int[] plants, int capacityA, int capacityB) {
        int n = plants.length;
        int left = 0, right = n - 1;
        int a = capacityA, b = capacityB;
        int refills = 0;

        while (left < right) {
            if (a >= plants[left]) {
                a -= plants[left];
            } else {
                refills++;
                a = capacityA - plants[left];
            }
            left++;

            if (b >= plants[right]) {
                b -= plants[right];
            } else {
                refills++;
                b = capacityB - plants[right];
            }
            right--;
        }
        if (left == right) {
            if (Math.max(a, b) < plants[left]) {
                refills++;
            }
        }

        return refills;
    }
}