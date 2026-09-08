/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();
        ListNode temp = headA;
        ListNode temp2 = headB;
        while(temp != null){
            set.add(temp);
            temp = temp.next;
        }
        while(temp2 != null){
            if(!set.contains(temp2)){
                set.add(temp2);
                temp2 = temp2.next;
            }
            else return temp2;
        }
        return null;
    }
}