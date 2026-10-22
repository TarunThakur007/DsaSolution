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
    public ListNode oddEvenList(ListNode head) {
        if (head == null)
            return null;
        if (head.next == null)
            return head;
        ListNode oddHead = head;
        ListNode evenHead = head.next;
        ListNode odd = oddHead;
        ListNode even = evenHead;
        ListNode curr = head.next.next;
        int count = 3;
        while (curr != null) {
            if (count % 2 == 0) {
                even.next = curr;
                even = even.next;
            } else {
                odd.next = curr; 
                odd = odd.next;
            }
            count++;
            curr = curr.next;
        }
        even.next = null;
        odd.next = evenHead;
        return oddHead;
    }
}

// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if (head == null)
//             return null;
//         ListNode odd = head;
//         ListNode even = head.next;
//         ListNode evenHead = even;
//         while (even != null && even.next != null) {
//             odd.next = even.next;
//             odd = odd.next;
//             even.next = odd.next;
//             even = even.next;
//         }
//         odd.next = evenHead;
//         return head;
//     }
// }