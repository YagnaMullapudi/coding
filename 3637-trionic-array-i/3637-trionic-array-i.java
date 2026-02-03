class Solution {
    public boolean isTrionic(int[] nums) {
        int n = nums.length;
        if (n < 3) return false;

        int i = 1;

        // Phase 1: strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // Need at least one increasing step
        if (i == 1 || i == n) return false;

        // Phase 2: strictly decreasing
        int p = i;
        while (i < n && nums[i] < nums[i - 1]) {
            i++;
        }

        // Need at least one decreasing step
        if (i == p || i == n) return false;

        // Phase 3: strictly increasing
        while (i < n && nums[i] > nums[i - 1]) {
            i++;
        }

        // Must reach the end
        return i == n;
    }
}
