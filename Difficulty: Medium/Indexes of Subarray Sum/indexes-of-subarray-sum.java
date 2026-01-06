import java.util.ArrayList;

class Solution {
    public ArrayList<Integer> subarraySum(int[] arr, int target) {
        ArrayList<Integer> result = new ArrayList<>();
        int left = 0;
        long sum = 0;

        for (int right = 0; right < arr.length; right++) {
            sum += arr[right];

            // Shrink window if sum exceeds target
            while (sum > target && left <= right) {
                sum -= arr[left];
                left++;
            }

            // Found the target sum
            if (sum == target) {
                result.add(left + 1);   // 1-based index
                result.add(right + 1);  // 1-based index
                return result;
            }
        }

        // If no subarray found
        result.add(-1);
        return result;
    }
}
