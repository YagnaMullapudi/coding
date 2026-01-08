class Solution {
    public int maxDotProduct(int[] nums1, int[] nums2) {
        int n = nums1.length, m = nums2.length;
        int[][] dp = new int[n + 1][m + 1];

        // Initialize dp with very small values
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j <= m; j++) {
                dp[i][j] = Integer.MIN_VALUE;
            }
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= m; j++) {
                int product = nums1[i - 1] * nums2[j - 1];

                // Option 1: start new subsequence
                int take = product;

                // Option 2: extend previous subsequence (only if valid)
                if (dp[i - 1][j - 1] != Integer.MIN_VALUE) {
                    take = Math.max(take, product + dp[i - 1][j - 1]);
                }

                // Option 3: skip elements
                dp[i][j] = Math.max(
                    take,
                    Math.max(dp[i - 1][j], dp[i][j - 1])
                );
            }
        }

        return dp[n][m];
    }
}
