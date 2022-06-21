/*
 * @lc app=leetcode id=19 lang=java
 *
 * [19] Remove Nth Node From End of List
 */

// @lc code=start
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
    //     ListNode temp=head;
    //     if(head.next==null && n==1)
    //         return null;
    //      ListNode slow= null;
    //      ListNode fast=head;
         
    //  int c=0;
    //  while(temp!=null)
    //  {
    //      c++;
    //      temp=temp.next;
    //  }
    //  for(int i=0;i<c-n;i++)
    //  {
    //     slow=fast;
    //      fast=fast.next;
    //  }
    //      if(fast.next!=null)
    //      slow.next=fast.next;
    //      else
    //        slow.next=null;
    //      return head;
    //  }}
    ListNode start = new ListNode(0);
    ListNode slow = start, fast = start;
    slow.next = head;
    
   
    for(int i=1; i<=n+1; i++)   {
        fast = fast.next;
    }
    
    while(fast != null) {
        slow = slow.next;
        fast = fast.next;
    }
   
    slow.next = slow.next.next;
    return start.next;
}
}
    
// @lc code=end

