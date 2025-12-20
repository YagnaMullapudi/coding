class Solution {
    public static double posAverage(int[] arr) {
        int sum = 0;
        int count = 0;

        for (int num : arr) {
            if (num >= 0) {   // non-negative numbers
                sum += num;
                count++;
            }
        }

        return (double) sum / count;
    }
}
