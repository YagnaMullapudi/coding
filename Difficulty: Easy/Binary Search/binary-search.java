class Solution {
    public int binarysearch(int[] arr, int k) {
        int left = 0;
        int right = arr.length - 1;
        int result = -1; // store index of first occurrence

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] == k) {
                result = mid;      // potential answer found
                right = mid - 1;   // continue searching in left half for first occurrence
            } else if (arr[mid] < k) {
                left = mid + 1;
            } else { // arr[mid] > k
                right = mid - 1;
            }
        }

        return result;
    }
}
