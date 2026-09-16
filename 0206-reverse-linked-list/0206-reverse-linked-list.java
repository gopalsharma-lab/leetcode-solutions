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
        if(head == null) return null;
        ListNode curr = head;
        ListNode k =  curr.next;
        ListNode i = null;
        while(k != null){
            curr.next = i;
            i = curr;
            curr = k;
            k = k.next;
        }
        curr.next = i;
        return curr;

    }
}