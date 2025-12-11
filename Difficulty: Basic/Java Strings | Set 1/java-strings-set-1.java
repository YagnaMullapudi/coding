class Solution {
    String conRevstr(String S1, String S2) {
        // Step 1: Concatenate the strings
        String combined = S1 + S2;

        // Step 2: Reverse the combined string
        StringBuilder sb = new StringBuilder(combined);
        sb.reverse();

        // Step 3: Return the reversed string
        return sb.toString();
    }
}
