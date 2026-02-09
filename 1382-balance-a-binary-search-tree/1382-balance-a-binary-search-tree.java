import java.util.*;

class Solution {
    public TreeNode balanceBST(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        inorder(root, list);
        return buildBalanced(list, 0, list.size() - 1);
    }

    // Step 1: Inorder traversal
    private void inorder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        inorder(root.left, list);
        list.add(root.val);
        inorder(root.right, list);
    }

    // Step 2: Build balanced BST
    private TreeNode buildBalanced(List<Integer> list, int start, int end) {
        if (start > end) return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(list.get(mid));

        node.left = buildBalanced(list, start, mid - 1);
        node.right = buildBalanced(list, mid + 1, end);

        return node;
    }
}
