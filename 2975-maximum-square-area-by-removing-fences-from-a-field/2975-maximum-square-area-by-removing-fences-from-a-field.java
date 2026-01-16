import java.util.*;

class Solution {
    public int maximizeSquareArea(int m, int n, int[] hFences, int[] vFences) {
        final int MOD = 1_000_000_007;

        // Add boundary fences
        int[] h = new int[hFences.length + 2];
        int[] v = new int[vFences.length + 2];
        
        h[0] = 1;
        h[h.length - 1] = m;
        v[0] = 1;
        v[v.length - 1] = n;
        
        for (int i = 0; i < hFences.length; i++) h[i + 1] = hFences[i];
        for (int i = 0; i < vFences.length; i++) v[i + 1] = vFences[i];

        Arrays.sort(h);
        Arrays.sort(v);

        // Store all horizontal distances
        Set<Integer> horizontalDistances = new HashSet<>();
        for (int i = 0; i < h.length; i++) {
            for (int j = i + 1; j < h.length; j++) {
                horizontalDistances.add(h[j] - h[i]);
            }
        }

        // Find maximum square side
        int maxSide = 0;
        for (int i = 0; i < v.length; i++) {
            for (int j = i + 1; j < v.length; j++) {
                int width = v[j] - v[i];
                if (horizontalDistances.contains(width)) {
                    maxSide = Math.max(maxSide, width);
                }
            }
        }

        if (maxSide == 0) return -1;

        long area = (long) maxSide * maxSide;
        return (int) (area % MOD);
    }
}
