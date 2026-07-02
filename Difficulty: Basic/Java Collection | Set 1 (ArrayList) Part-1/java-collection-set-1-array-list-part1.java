class Solution {
    ArrayList<Integer> solve(int N, ArrayList<Integer> A, int Q,
                             ArrayList<Integer> Query) {

        if (Q == 1) {
            int p = Query.get(0);
            int r = Query.get(1);

            A.add(p, r);
            return A;
        } else {
            int p = Query.get(0);

            ArrayList<Integer> ans = new ArrayList<>();
            ans.add(A.lastIndexOf(p));   // returns -1 if not found
            return ans;
        }
    }
}