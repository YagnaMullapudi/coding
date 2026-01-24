import java.util.Arrays;

class Solution {
    public int minPairSum(int[] nums) {
        Arrays.sort(nums);  // Sort the array first
        int n = nums.length;
        int maxPairSum = 0;

        for (int i = 0; i < n / 2; i++) {
            int pairSum = nums[i] + nums[n - 1 - i]; // Pair smallest with largest
            maxPairSum = Math.max(maxPairSum, pairSum); // Keep track of the maximum pair sum
        }

        return maxPairSum;
    }
}
