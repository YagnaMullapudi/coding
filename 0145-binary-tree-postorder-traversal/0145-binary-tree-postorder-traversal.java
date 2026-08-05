public class Solution {
    public List<Integer> postorderTraversal(TreeNode root) {
        LinkedList<Integer> res = new LinkedList<>();
        if (root == null) return res;
        Deque<TreeNode> stack = new ArrayDeque<>();
        stack.push(root);
        while (!stack.isEmpty()){
            root = stack.pop();
            res.addFirst(root.val);
            if (root.left  != null) stack.push(root.left );
            if (root.right != null) stack.push(root.right);
        }
        return res;
    }
}