import java.util.Arrays;

class Solution {
    public static int sumUsingStreams(int[] arr) {
        return Arrays.stream(arr).sum();
    }
}