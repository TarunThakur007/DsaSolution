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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode t1 = l1;
        ListNode t2 = l2;
        int c = 0;
        ListNode newNode = new ListNode(0);
        ListNode temp = newNode;
        while(t1!=null && t2!=null){
            int sum = t1.val+t2.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t1 = t1.next;
            t2 = t2.next;
        }
        while(t1!=null){
            int sum = t1.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t1 = t1.next;
        }
        while(t2!=null){
            int sum =t2.val+c;
            temp.next = new ListNode(sum%10);
            temp = temp.next;
            c = sum/10;
            t2 = t2.next;
        }
        if(c>0){
            temp.next = new ListNode(c%10);
        }
        return newNode.next;
    }
}