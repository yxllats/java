//判断链表是否有环
  class ListNode {
      int val;
      ListNode next;
      ListNode(int x) {
          val = x;
          next = null;
      }
 }
class Solution {
    public boolean hasCycle(ListNode head) {
        if(head==null){
            return false;
        }
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null&&fast.next.next!=null){
            fast = fast.next.next.next;
            if(fast==null){
                return false;
            }
            slow = slow.next.next;
            if(fast==slow){
                return true;
            }
        }
        return false;
    }

   /* ListNode* fast = head;
    ListNode* slow = head;
    while(fast != NULL && fast->next != NULL){
        fast=fast->next->next;
        slow=slow->next;
        if(slow == fast)
            return true;
    }
    return false;
    */
}