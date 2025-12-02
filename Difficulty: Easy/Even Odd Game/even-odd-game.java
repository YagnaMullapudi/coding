class Solution {
    public static String utility(int n) {

        // If n is odd -> You win, else Friend wins
        if (n % 2 == 1) {
            return "You";
        } else {
            return "Friend";
        }
    }
}
