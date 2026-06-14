/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution {
    public boolean hasCycle(ListNode head) {
        HashSet<ListNode> nodeHashSet = new HashSet<ListNode>();
        boolean isLoop = false;
        ListNode currentNode = head;

        // Populate HashSet
        while(isLoop == false && currentNode != null) {
            if(nodeHashSet.contains(currentNode)) {
                return true;
            } else {
                nodeHashSet.add(currentNode);
                currentNode = currentNode.next;
            }
        }

        return false;
    }
}
