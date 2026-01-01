class Solution {
    public int[] plusOne(int[] digits) {
        int n = digits.length;

        // Traverse from last digit to first
        for (int i = n - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;      // add one and return
                return digits;
            }
            digits[i] = 0;        // set to 0 if digit was 9
        }

        // If all digits were 9
        int[] result = new int[n + 1];
        result[0] = 1;            // e.g., 999 -> 1000
        return result;
    }
}
