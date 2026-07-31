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
    public int maxDepth(TreeNode root) {
        Deque<TreeNode> levelStack = new ArrayDeque<TreeNode>();
        if(root != null) levelStack.add(root);

        int level = 0;
        int levelSize = levelStack.size();

        while(levelSize > 0) {
            for(int i = 0; i < levelSize; i++) {
                // []
                TreeNode current = levelStack.poll();
                if(current.left != null) levelStack.add(current.left);
                if(current.right != null) levelStack.add(current.right);
            }
            levelSize = levelStack.size(); // 1
            level++; // 3
        }

        return level;

    }
        
}
