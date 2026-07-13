import java.util.Arrays;

class Solution {
    public static int maxUsingStreams(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }
}