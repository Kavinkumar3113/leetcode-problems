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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode temp=head;
        while(temp!=null)
        {
            count++;
            temp=temp.next;
        }
         if(count==1&&n==1)
            return null;
         count-=n;
         if(count==0)
            return head.next;
         count--;
         
         temp=head;
         while(count>0)
         {
            temp=temp.next;
         
            count--;
         }
         temp.next=temp.next.next;
         return head;
    }
}