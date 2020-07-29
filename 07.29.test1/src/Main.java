class ListNode {
    int val;
    ListNode next = null;

    ListNode(int val) {
        this.val = val;
    }
}
public class Main {
    public static ListNode ReverseList(ListNode head) {
        if(head==null||head.next==null){
            return head;
        }
        ListNode first = head;
        ListNode second = first.next;
        ListNode thrid = second.next;

        while (thrid!=null){
            second.next = first;
            first = second;
            second = thrid;
            thrid = thrid.next;
        }
        second.next = first;
        head.next = null;
        return second;
    }

    public static void main(String[] args) {

    }
}