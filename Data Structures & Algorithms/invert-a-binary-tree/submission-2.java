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
    public TreeNode invertTree(TreeNode root) {
        // Base case
        if(root == null) { return null; }
        
        // Switch the current node
        TreeNode tempLeft = root.left;
        root.left = root.right;
        root.right = tempLeft;

        // Process left side
        invertTree(root.left);
        // Process right side
        invertTree(root.right);

        return root;
    }
}
