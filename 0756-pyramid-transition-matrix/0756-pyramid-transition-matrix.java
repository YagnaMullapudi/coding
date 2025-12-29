import java.util.*;

class Solution {
    Map<String, List<Character>> map = new HashMap<>();

    public boolean pyramidTransition(String bottom, List<String> allowed) {
        for (String s : allowed) {
            String key = s.substring(0, 2);
            char val = s.charAt(2);
            map.computeIfAbsent(key, k -> new ArrayList<>()).add(val);
        }

        return build(bottom);
    }

    private boolean build(String current) {
        if (current.length() == 1) return true;

        List<String> nextLevels = new ArrayList<>();
        generateNext(current, 0, new StringBuilder(), nextLevels);
        for (String next : nextLevels) {
            if (build(next)) return true;
        }
        return false;
    }

    private void generateNext(String current, int index, 
                              StringBuilder sb, List<String> result) {
        if (index == current.length() - 1) {
            result.add(sb.toString());
            return;
        }

        String key = current.substring(index, index + 2);
        if (!map.containsKey(key)) return;

        for (char c : map.get(key)) {
            sb.append(c);
            generateNext(current, index + 1, sb, result);
            sb.deleteCharAt(sb.length() - 1);
        }
    }
}
