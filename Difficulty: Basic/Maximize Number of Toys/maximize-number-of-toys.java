import java.util.Arrays;

class Solution {
    public static int maxToys(int arr[], int k) {
        Arrays.sort(arr);

        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (k >= arr[i]) {
                k -= arr[i];
                count++;
            } else {
                break;
            }
        }

        return count;
    }
}