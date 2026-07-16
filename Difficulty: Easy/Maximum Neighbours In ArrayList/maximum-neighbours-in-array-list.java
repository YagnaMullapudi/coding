class Solution {
    public static ArrayList<Integer> maxNeighbour(ArrayList<Integer> arr) {

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.size() - 1; i++) {
            ans.add(Math.max(arr.get(i), arr.get(i + 1)));
        }

        return ans;
    }
}