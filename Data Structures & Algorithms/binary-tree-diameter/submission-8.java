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
    public int maxDiameter = 0;

    public int heightFromNode(TreeNode root) {
        int left = 0;
        int right = 0;
        // [5] -> l 0 r 0 -> ret 1
        // [3] -> l 1 r 0 -> ret 2
        // [2] -> l 2 r 1 -> ret 3
        // [1] -> l 0 r 3 -> ret 4
        if(root == null) return 0;
        left = left + heightFromNode(root.left);
        right = right + heightFromNode(root.right);
        maxDiameter = Math.max(maxDiameter, left + right);
        return 1 + Math.max(left, right);
    }

    public int diameterOfBinaryTree(TreeNode root) {
        heightFromNode(root);

        return maxDiameter;
    }
}
