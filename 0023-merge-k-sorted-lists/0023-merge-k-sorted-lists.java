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
      public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
         if(list1==null&& list2==null)
           return null;
        if(list1==null&& list2!=null)
           return list2;
        if(list1!=null&& list2==null)
           return list1;
        ListNode ans=new ListNode();
        ListNode temp=ans;

        while(list1!=null&&list2!=null)
        {
            while(list1.val<=list2.val)
            {
                temp.next=new ListNode(list1.val);
                temp=temp.next;
                if(list1.next==null)
                    {
                        temp.next=list2;
                          return ans.next;
                    }
                list1=list1.next;
               
            }
             while(list1.val>list2.val)
            {
                temp.next=new ListNode(list2.val);
                temp=temp.next;
                 if(list2.next==null)
                    {
                        temp.next=list1;
                          return ans.next;
                    }
                list2=list2.next;
                
            }
        }
        
        return ans.next;
    }
    public ListNode mergeKLists(ListNode[] lists) {
        int n=lists.length;
        if(n==0)
        return null;
        for(int i=1;i<n;i++)
        {
            lists[0]=mergeTwoLists(lists[0],lists[i]);
        }
        return lists[0];
    }
}