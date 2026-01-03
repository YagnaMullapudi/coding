class Solution {
    public static char extraChar(String s1, String s2) {
        char result = 0;

        // XOR all characters of s1
        for (int i = 0; i < s1.length(); i++) {
            result ^= s1.charAt(i);
        }

        // XOR all characters of s2
        for (int i = 0; i < s2.length(); i++) {
            result ^= s2.charAt(i);
        }

        return result;
    }
}
