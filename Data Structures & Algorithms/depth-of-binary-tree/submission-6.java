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
        int depth = 1;

        if(root == null)
            return 0;
        
        LinkedList<Pair<TreeNode, Integer>> queue = new LinkedList<>();
        queue.offer(new Pair(root, 1));

        while(queue.size() > 0) {
            Pair<TreeNode, Integer> currentNodePair = queue.poll();
            TreeNode currentNode = currentNodePair.getKey();
            Integer currentDepth = currentNodePair.getValue();

            if(currentNode.left != null) {
                queue.offer(new Pair(currentNode.left, currentDepth + 1));
                depth = Math.max(depth, currentDepth + 1);
            }
            if(currentNode.right != null) {
                queue.offer(new Pair(currentNode.right, currentDepth + 1));
                depth = Math.max(depth, currentDepth + 1);
            }

        }

        return depth;
        
    }
}
