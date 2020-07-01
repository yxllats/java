import java.util.*;


 class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Partition {
    public ListNode partition(ListNode pHead, int x) {
        // write code here
        if(pHead==null)
        {
            return null;
        }
        ListNode cur = pHead;
        ListNode st1 = null;
        ListNode ed1 = null;
        ListNode st2 = null;
        ListNode ed2 = null;
        while(cur!=null) {
            if(st1 == null && cur.val < x){
                st1 = cur;
                ed1 = st1;
            }else if(st2 == null && cur.val >= x){
                st2 = cur;
                ed2 = st2;
            }else {
                if (cur.val < x) {
                    ed1.next = cur;
                    ed1 = cur;
                } else {
                    ed2.next = cur;
                    ed2 = cur;
                }
            }
            cur = cur.next;
        }
        if(st1 == null) {
            return st2;
        }
        ed1.next = st2;
        if(ed2 != null){
            ed2.next = null;
        }
        return st1;
    }
}