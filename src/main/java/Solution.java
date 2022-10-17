public class Solution {
    public int minDepth(TreeNode root) {
        // there are no nodes
        if (root == null) {
            return 0;
        }

        // if left sub tree is null, find the min depth for right sub tree
        // + 1 for the current layer
        if (root.left == null) {
            return 1 + minDepth(root.right);
        }
        // if right sub tree is null, find the min depth for left sub tree
        // + 1 for the current layer
        else if (root.right == null) {
            return 1 + minDepth(root.left);
        }

        // left subtree AND right sub tree are not null
        return 1 + Math.min(minDepth(root.left), minDepth(root.right));
    }
}
