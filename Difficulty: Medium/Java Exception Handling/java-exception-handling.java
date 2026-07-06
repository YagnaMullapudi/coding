class Solution {
    public int findMin(int a, int b) {
        int min = Math.min(Math.min(a + b, a - b), a * b);

        try {
            min = Math.min(min, a / b);
        } catch (ArithmeticException e) {
            // Ignore division by zero
        }

        return min;
    }
}