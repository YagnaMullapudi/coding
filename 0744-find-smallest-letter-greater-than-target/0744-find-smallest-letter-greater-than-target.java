class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int low = 0, high = letters.length - 1;
        char result = letters[0]; // default wrap-around

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (letters[mid] > target) {
                result = letters[mid];
                high = mid - 1; // search left part
            } else {
                low = mid + 1; // search right part
            }
        }
        return result;
    }
}
