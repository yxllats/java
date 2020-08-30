//删除链表重复结点
 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}

public class Solution {
    public ListNode deleteDuplication(ListNode pHead)
    {
        if(pHead == null) {
            return null;
        }
        ListNode head = new ListNode(-1);
        ListNode cur = head;
        while(pHead!=null){
            if(pHead.next!=null&&pHead.val==pHead.next.val){
                while(pHead.next!=null&&pHead.val==pHead.next.val){
                    pHead = pHead.next;
                }
                pHead = pHead.next;
            }else{
                head.next = pHead;
                head = head.next;
                pHead = pHead.next;
            }

        }
        head.next=null;
        return cur.next;
    }
}