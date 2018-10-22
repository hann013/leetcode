// Delete Node in a Linked List

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public void deleteNode(ListNode node) {
        ListNode nextNode = node.next;

        // copy the next node's value into the current node
        node.val = nextNode.val;

        // skip over the next node
        node.next = nextNode.next;
    }
}