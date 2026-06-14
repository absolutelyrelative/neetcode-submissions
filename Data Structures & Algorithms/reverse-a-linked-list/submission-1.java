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
    public ListNode reverseList(ListNode head) {
        // 1, 2, 3, 4
        ListNode currentNode = head;
        ListNode previousNode = null;

        while(currentNode != null) {
            ListNode tempNode = currentNode.next;
            currentNode.next = previousNode;
            previousNode = currentNode;
            currentNode = tempNode;

        }

        return previousNode;

    }
}
