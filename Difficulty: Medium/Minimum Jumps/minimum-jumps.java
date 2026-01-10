class Solution {
    public int minJumps(int[] arr) {
        int n = arr.length;

        // If array has only one element
        if (n == 1) {
            return 0;
        }

        // If first element is 0, cannot move
        if (arr[0] == 0) {
            return -1;
        }

        int maxReach = arr[0];
        int steps = arr[0];
        int jumps = 1;

        for (int i = 1; i < n; i++) {
            // If we have reached the end
            if (i == n - 1) {
                return jumps;
            }

            // Update maxReach
            maxReach = Math.max(maxReach, i + arr[i]);
            steps--;

            // If no more steps left
            if (steps == 0) {
                jumps++;

                // If current position is beyond maxReach
                if (i >= maxReach) {
                    return -1;
                }

                // Reinitialize steps
                steps = maxReach - i;
            }
        }

        return -1;
    }
}
