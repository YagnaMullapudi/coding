import java.util.*;

class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        ArrayList<Integer> result = new ArrayList<>();
        
        int maxFromRight = arr[arr.length - 1];
        result.add(maxFromRight); // rightmost element is always a leader
        
        // Traverse from right to left
        for (int i = arr.length - 2; i >= 0; i--) {
            if (arr[i] >= maxFromRight) {
                maxFromRight = arr[i];
                result.add(arr[i]);
            }
        }
        
        // Reverse to maintain original order
        Collections.reverse(result);
        return result;
    }
}
