/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode temp=head;
        ArrayList<ListNode> map=new ArrayList<>();
        while(temp!=null)
        {
         
           if(map.contains(temp))
           {
            return true;
           }
           map.add(temp);
           temp=temp.next;
        }
        return false;
    }
}