import java.util.*;
/**
 * Author: dts
 * DateTime: 2020/6/25 10:20
 * Description: TODO
 */

class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public ListNode plusAB(ListNode a, ListNode b) {
        // write code here
        int  n = 0;
        ListNode head = new ListNode(a.val+b.val);
        ListNode cur = head;
        ListNode pre = head;
        a = a.next;
        b = b.next;
        if(head.val>9){
            n++;
        }

        while (a!=null&&b!=null){
            if(n>0) {
                head.next = new ListNode(a.val + b.val+1);
                n--;
            }else {
                head.next = new ListNode(a.val + b.val);
            }
            a = a.next;
            b = b.next;
            head = head.next;
            if(head.val>9){
                n++;
            }
        }
        while (a!=null){
            if(n>0) {
                head.next = new ListNode(a.val+1);
                n--;
            }else {
                head.next = new ListNode(a.val );
            }
            a = a.next;
            head = head.next;
            if(head.val>9){
                n++;
            }

        }
        while (b!=null){
            if(n>0) {
                head.next = new ListNode( b.val+1);
                n--;
            }else {
                head.next = new ListNode( b.val);
            }
            b = b.next;
            head = head.next;
            if(head.val>9){
                n++;
            }
        }
        if(n>0){
            head.next = new ListNode( 1);
        }
        while (cur!=null){
            if(cur.val>9) {
                cur.val -= 10;
            }
            cur = cur.next;
        }
        return pre;
    }
}