class Solution {
    public static int unique_substring(String s) {
        HashSet<String> set = new HashSet<>();

        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                set.add(s.substring(i, j));
            }
        }

        return set.size();
    }
}