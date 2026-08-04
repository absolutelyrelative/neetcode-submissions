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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null && q != null) return false;
        if(q == null && p != null) return false;
        boolean currentNode = p.val == q.val;
        boolean leftNode = false;
        boolean rightNode = false;
        if(p.left != null && q.left != null)
            leftNode = isSameTree(p.left, q.left);
        if(p.left == null && q.left == null)
            leftNode = true;
        if(p.right != null && q.right != null)
            rightNode = isSameTree(p.right, q.right);
        if(p.right == null && q.right == null)
            rightNode = true;

        return currentNode && leftNode && rightNode;
    }
}
