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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode temp = dummy;
        for(int i=0;i<left-1;i++)
        {
            temp=temp.next;
        }
        ListNode curr = temp.next;
        for(int i=0;i<right-left;i++)
        {
            ListNode newNode = curr.next;
            curr.next = newNode.next;
            newNode.next = temp.next;
            temp.next = newNode;
        }
        return dummy.next;
    }
}