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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans = new ArrayList<>();
        Queue<TreeNode> q = new LinkedList<>();

        if (root == null)
            return ans;

        q.offer(root);

        while (!q.isEmpty()) {
            int size = q.size();
            for (int i = 0; i < size; i++) {

                TreeNode node = q.poll();

                if (node.left != null)
                    q.offer(node.left);

                if (node.right != null)
                    q.offer(node.right);

                if (i == size - 1) {
                    ans.add(node.val);
                }
            }
        }

        return ans;
    }
}