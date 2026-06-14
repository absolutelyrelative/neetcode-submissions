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
    int res = 0;
    //height = 1 + max(left, right)
    //diameter = left + right
    public int inOrder(TreeNode treeNode) {
        // Given a node, calculate the maximum height
        int rightHeight = 0;
        int leftHeight = 0;

        if(treeNode == null)
            return 0;
        rightHeight = inOrder(treeNode.right);
        leftHeight = inOrder(treeNode.left);
        res = Math.max(res, rightHeight + leftHeight);

        return 1 + Math.max(rightHeight, leftHeight);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        inOrder(root);
        return res;
    }
}
