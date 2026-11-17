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
    public ListNode middleNode(ListNode head) {
        int c = 0;
        ListNode cur = head;
        while(cur!=null){
            c++;
            cur=cur.next;
        }
        int m = c/2;
        int k = 0;
        cur = head;
        while(k<m){
            cur = cur.next;
            k++;
        }
        return cur;
    }
}