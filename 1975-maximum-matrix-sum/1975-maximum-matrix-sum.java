class Solution {
    public long maxMatrixSum(int[][] matrix) {
        long totalSum = 0;
        int minAbs = Integer.MAX_VALUE;
        int negativeCount = 0;
        boolean hasZero = false;

        for (int[] row : matrix) {
            for (int val : row) {
                if (val < 0) negativeCount++;
                if (val == 0) hasZero = true;

                int absVal = Math.abs(val);
                totalSum += absVal;
                minAbs = Math.min(minAbs, absVal);
            }
        }

        // If negatives are odd and no zero exists, subtract 2 * smallest absolute value
        if (negativeCount % 2 == 1 && !hasZero) {
            totalSum -= 2L * minAbs;
        }

        return totalSum;
    }
}
