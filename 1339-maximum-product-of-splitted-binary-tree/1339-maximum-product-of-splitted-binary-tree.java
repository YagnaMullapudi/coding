class Solution {
    private static final int MOD = 1_000_000_007;
    long totalSum = 0;
    long maxProduct = 0;

    public int maxProduct(TreeNode root) {
        // Step 1: calculate total sum of the tree
        totalSum = getTotalSum(root);

        // Step 2: calculate max product by considering every split
        getSubtreeSum(root);

        return (int)(maxProduct % MOD);
    }

    // First DFS: compute total sum
    private long getTotalSum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getTotalSum(node.left) + getTotalSum(node.right);
    }

    // Second DFS: compute subtree sums and max product
    private long getSubtreeSum(TreeNode node) {
        if (node == null) return 0;

        long left = getSubtreeSum(node.left);
        long right = getSubtreeSum(node.right);

        long subTreeSum = node.val + left + right;

        // product if we cut above this subtree
        long product = subTreeSum * (totalSum - subTreeSum);
        maxProduct = Math.max(maxProduct, product);

        return subTreeSum;
    }
}
