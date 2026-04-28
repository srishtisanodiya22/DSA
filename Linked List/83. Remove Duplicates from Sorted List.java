/*Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.


Example 1:

Input: head = [1,1,2]
Output: [1,2]


Example 2:

Input: head = [1,1,2,3,3]
Output: [1,2,3]
*/

//-----------------------------------------------------------------------------------------------


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
    public ListNode deleteDuplicates(ListNode head) {
        if(head==null || head.next==null){
            return head;
        }
        ListNode temp=head;
        ListNode track=head.next;
        while(temp.next!=null){
            if(temp.val==track.val){
                if(track.next==null && temp.val==track.val){
                    temp.next=track.next;
                    return head;
                }
                if(track.next==null){
                    return head;
                }
                track=track.next;
                continue;
            }
            temp.next=track;
            temp=temp.next;
            track=track.next;
        }
        return head;
    }
}