/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int countNodes(TreeNode root) {
        int totNodes = 0;

        if (root == null)
            return 0;

        int leftNodes = countNodes(root.left);
        int rightNodes = countNodes(root.right);

        return 1 + leftNodes + rightNodes;
    }
}