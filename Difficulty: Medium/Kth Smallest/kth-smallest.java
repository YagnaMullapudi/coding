import java.util.Arrays;

class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Step 1: Sort the array
        Arrays.sort(arr);
        
        // Step 2: Return the (k-1)th index element
        return arr[k - 1];
    }
}
