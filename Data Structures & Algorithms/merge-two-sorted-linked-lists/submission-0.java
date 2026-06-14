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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode newNode = new ListNode();
        ListNode currentNode = newNode;
        ListNode l1 = list1;
        ListNode l2 = list2;

        // Iterate through both lists
        //  1   2   4
        //  l1
        //  1   3   5
        //  l2

        //  1   2   4
        //  l1
        //  1   3   5
        //      l2

        //  1   2   4
        //      l1
        //  1   3   5
        //      l2

        //  1   2   4
        //          l1
        //  1   3   5
        //      l2

        //  1   2   4
        //          l1
        //  1   3   5
        //          l2


        //  1   2   4
        //              l1 (0)
        //  1   3   5
        //          l2
        while (l1 != null && l2 != null) {
            if(l1.val < l2.val) {
                currentNode.next = l1;
                l1 = l1.next;
            } else {
                currentNode.next = l2;
                l2 = l2.next;
            }

            currentNode = currentNode.next;
        }

        if(l1 != null) {
            currentNode.next = l1;
        } else {
            currentNode.next = l2;
        }

        return newNode.next;
    }
}