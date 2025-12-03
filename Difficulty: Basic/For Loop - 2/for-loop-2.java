class Solution {
    public static void utility(String s) {
        StringBuilder result = new StringBuilder();

        // Loop through each character of the string
        for (int i = 0; i < s.length(); i++) {
            // Check if index is even
            if (i % 2 == 0) {
                result.append(s.charAt(i));
            }
        }

        // Print the result (as asked in the problem)
        System.out.print(result.toString());
    }
}
