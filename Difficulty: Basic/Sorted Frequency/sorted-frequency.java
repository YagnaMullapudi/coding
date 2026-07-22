import java.util.*;

class Solution {
    public static void freqSorted(int arr[]) {
        TreeMap<Integer, Integer> map = new TreeMap<>();

        // Count frequency
        for (int num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        // Print elements in sorted order
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}