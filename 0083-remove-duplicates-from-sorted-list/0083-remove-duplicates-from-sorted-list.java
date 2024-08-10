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
        if(head==null||head.next==null)
             return head;
        ListNode tem=head.next,temp=head;
        
        while(tem!=null)
        {
            if(temp.val!=tem.val)
            {
                 temp.next=tem;
                 temp=tem;
                 tem=tem.next;
            }
            else
            {
                tem=tem.next;
            }
            temp.next=tem;
           
            
        }
        return head;
        
    }
}