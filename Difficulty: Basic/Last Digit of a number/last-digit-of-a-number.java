class Solution {
    public int lastDigit(int n) {
        // If n is negative, convert it to positive
        n = Math.abs(n);
        return n % 10;
    }
}
