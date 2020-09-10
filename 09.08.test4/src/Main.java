import java.util.ArrayList;


 class ListNode {
         int val;
         ListNode next = null;

         ListNode(int val) {
             this.val = val;
         }
 }
public class Main {
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        ArrayList<Integer> list = new ArrayList<>();
        if(listNode==null){
            return list;
        }
        if(listNode.next == null){
            list.add(listNode.val);
            return list;
        }
        ListNode first = listNode.next.next;
        ListNode second = listNode.next;
        ListNode thrid = listNode;
        second.next = thrid;
        thrid.next = null;

        while(first!=null){
            thrid = second;
            second = first;
            first = first.next;
            second.next = thrid;
        }
        while(second!=null){
            list.add(second.val);
            second = second.next;
        }
        return list;
    }
}