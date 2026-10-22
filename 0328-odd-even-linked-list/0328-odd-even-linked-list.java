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
// class Solution {
//     public ListNode oddEvenList(ListNode head) {
//         if(head==null) return null;
//         int count = 1;
//         ListNode even = null;
//         ListNode odd = null;
//         ListNode curr = head;
//         ListNode currEven = even;
//         while(curr != null){
//             if(count%2==0){
//                 even.next = head;
//                 even = even.next; 
//             }else{
//                 odd.next = head;
//                 odd = odd.next;
//             }
//             count++;
//             curr = curr.next;
//         } 
//         odd.next = currEven;
//         return ;
//     }
// }
class Solution {
    public ListNode oddEvenList(ListNode head) {
        if (head == null) return null;
        ListNode odd = head;
        ListNode even = head.next;
        ListNode evenHead = even;
        while (even != null && even.next != null) {
            odd.next = even.next;
            odd = odd.next;
            even.next = odd.next;
            even = even.next;
        }
        odd.next = evenHead;
        return head;
    }
}   