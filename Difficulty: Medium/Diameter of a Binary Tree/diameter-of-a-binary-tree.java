class Solution {
    
    // To store the maximum diameter found
    int maxDiameter = 0;

    public int diameter(Node root) {
        height(root);
        return maxDiameter;
    }

    // Helper function to calculate height
    private int height(Node node) {
        if (node == null) {
            return 0;
        }

        int leftHeight = height(node.left);
        int rightHeight = height(node.right);

        // Diameter at current node (number of edges)
        maxDiameter = Math.max(maxDiameter, leftHeight + rightHeight);

        // Return height of subtree
        return Math.max(leftHeight, rightHeight) + 1;
    }
}
