class Solution {
    public static int nthDay(int d, int n) {
        // n days before d
        return (d - (n % 7) + 7) % 7;
    }
}
