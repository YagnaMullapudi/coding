class Solution {
    public int longestBalanced(String s) {
        int n = s.length();
        int maxLen = 0;

        for (int i = 0; i < n; i++) {
            int[] freq = new int[26];

            for (int j = i; j < n; j++) {
                freq[s.charAt(j) - 'a']++;

                int minFreq = Integer.MAX_VALUE;
                int maxFreq = 0;
                int distinct = 0;

                for (int k = 0; k < 26; k++) {
                    if (freq[k] > 0) {
                        distinct++;
                        minFreq = Math.min(minFreq, freq[k]);
                        maxFreq = Math.max(maxFreq, freq[k]);
                    }
                }

                // Check if all distinct characters have equal frequency
                if (distinct > 0 && minFreq == maxFreq) {
                    maxLen = Math.max(maxLen, j - i + 1);
                }
            }
        }

        return maxLen;
    }
}
