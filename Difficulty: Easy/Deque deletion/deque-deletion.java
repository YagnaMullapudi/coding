class Solution {
    
    // 1. Remove element at index X
    public static void eraseAt(ArrayDeque<Integer> deq, int X) {
        if (X < 0 || X >= deq.size()) return;

        ArrayList<Integer> list = new ArrayList<>(deq);
        list.remove(X);

        deq.clear();
        deq.addAll(list);
    }

    // 2. Remove elements in range [start, end)
    public static void eraseInRange(ArrayDeque<Integer> deq, int start, int end) {
        if (start == end) return;

        ArrayList<Integer> list = new ArrayList<>(deq);

        // Handle boundaries safely
        start = Math.max(0, start);
        end = Math.min(list.size(), end);

        for (int i = start; i < end; i++) {
            list.remove(start);
        }

        deq.clear();
        deq.addAll(list);
    }

    // 3. Remove all elements
    public static void eraseAll(ArrayDeque<Integer> deq) {
        deq.clear();
    }
}
